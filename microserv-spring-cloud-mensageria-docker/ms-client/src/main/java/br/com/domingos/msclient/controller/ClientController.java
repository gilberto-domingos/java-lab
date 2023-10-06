package br.com.domingos.msclient.controller;

import br.com.domingos.msclient.entity.Client;
import br.com.domingos.msclient.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ClientController {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity save(@RequestBody Client client) {
        this.clientService.save(client);

        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(client.getCpf())
                .toUri();

        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<Client> findClientByCpf(@RequestParam("cpf") String cpf) {
        Optional<Client> client = this.clientService.findByCpf(cpf);

        if (client.isPresent()) {
            return ResponseEntity.ok(client.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}

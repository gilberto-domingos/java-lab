package br.com.domingos.msclient.controller;

import br.com.domingos.msclient.entity.Client;
import br.com.domingos.msclient.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Slf4j
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public String status() {
        log.info("status microservice clients");
        return "ok";
    }

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

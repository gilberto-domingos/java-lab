package br.com.domingos.mscards.controller;

import br.com.domingos.mscards.entity.CardClient;
import br.com.domingos.mscards.representation.CardsClientResponse;
import br.com.domingos.mscards.service.CardClientService;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cardclient")
@RequiredArgsConstructor
public class CardClientController {

    private final CardClientService cardClientService;

    @GetMapping(params = "cpf")
    public ResponseEntity<List<CardsClientResponse>> getCardsByClient(@RequestParam("cpf") String cpf) {
        List<CardClient> list = this.cardClientService.listCardByCpf(cpf);
        List<CardsClientResponse> resultList = list.stream()
                .map(CardsClientResponse::fromModel)
                .collect(Collectors.toList());

        return ResponseEntity.ok(resultList);
    }
}

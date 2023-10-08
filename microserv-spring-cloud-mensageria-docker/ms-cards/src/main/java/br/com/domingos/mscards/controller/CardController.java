package br.com.domingos.mscards.controller;

import br.com.domingos.mscards.entity.Card;
import br.com.domingos.mscards.representation.CardSaveRequest;
import br.com.domingos.mscards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping
    public String status() {
        return "ok";
    }

    @PostMapping
    public ResponseEntity<Card> registerCards(@RequestBody CardSaveRequest request) {
        Card card = request.toModel();
        this.cardService.save(card);

        return ResponseEntity.ok(card);
    }

    @GetMapping(params = "incomeFinancial")
    public ResponseEntity<List<Card>> getCardIncomeFinancialUntil(@RequestParam("incomeFinancial") Long incomeFinancial) {
        List<Card> list = this.cardService.getCardIncomeFinancialLowerEqual(incomeFinancial);
        return ResponseEntity.ok(list);
    }


}

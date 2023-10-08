package br.com.domingos.mscards.service;

import br.com.domingos.mscards.entity.Card;
import br.com.domingos.mscards.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImp implements CardService{

    private final CardRepository cardRepository;

    public Card save(Card card) {
      return this.cardRepository.save(card);
    }

    public List<Card> getCardIncomeFinancialLowerEqual(Long incomeFinancial){
        var incomeFinancialBigDecimal = BigDecimal.valueOf(incomeFinancial);
        return this.cardRepository.findByIncomeFinancialLessThanEqual(incomeFinancialBigDecimal);

    }

}

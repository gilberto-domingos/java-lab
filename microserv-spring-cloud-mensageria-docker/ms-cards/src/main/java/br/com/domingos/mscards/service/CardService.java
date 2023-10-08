package br.com.domingos.mscards.service;

import br.com.domingos.mscards.entity.Card;

import java.util.List;

public interface CardService {
    public Card save(Card card);

    public List<Card> getCardIncomeFinancialLowerEqual(Long incomeFinancial);
}

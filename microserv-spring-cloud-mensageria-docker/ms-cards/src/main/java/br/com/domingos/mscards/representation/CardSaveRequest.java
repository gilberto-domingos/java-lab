package br.com.domingos.mscards.representation;

import br.com.domingos.mscards.entity.BannerCard;
import br.com.domingos.mscards.entity.Card;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Data
public class CardSaveRequest {
    private String name;
    private BannerCard banner;
    private BigDecimal incomeFinancial;
    private BigDecimal basicLimit;

    public Card toModel() {
        return new Card(name, banner, incomeFinancial, basicLimit);
    }
}

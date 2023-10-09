package br.com.domingos.mscards.representation;

import br.com.domingos.mscards.entity.CardClient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardsClientResponse {
    private String name;
    private String banner;
    private BigDecimal limitAllowed;

    public static CardsClientResponse fromModel(CardClient model){
        return new CardsClientResponse(
                model.getCard().getName(),
                model.getCard().getBanner().toString(),
                model.getCardLimit()
        );
    }
}

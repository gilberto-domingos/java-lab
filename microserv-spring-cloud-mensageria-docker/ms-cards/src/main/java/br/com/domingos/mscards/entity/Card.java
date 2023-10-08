package br.com.domingos.mscards.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private BannerCard banner;
    private BigDecimal incomeFinancial;
    private BigDecimal basicLimit;

    public Card(String name, BannerCard banner, BigDecimal incomeFinancial, BigDecimal basicLimit) {
        this.name = name;
        this.banner = banner;
        this.incomeFinancial = incomeFinancial;
        this.basicLimit = basicLimit;
    }
}

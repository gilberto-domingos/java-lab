package br.com.domingos.collector.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "accesseds")
@Entity(name = "accesseds")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Accessed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String companyName;
    @Column
    private String cnpj;
    @Column
    private String address;
    @Column
    private String numberr;
    @Column
    private String cep;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String login;
    @Column
    private String ip;
    @Column
    private String latitude;
    @Column
    private String longitude;

}

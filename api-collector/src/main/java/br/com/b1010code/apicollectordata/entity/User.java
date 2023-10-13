package br.com.b1010code.apicollectordata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "user")
@Entity(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String companyName;
    private String cnpj;
    private String address;
    private String city;
    private String state;

}



///Depois do login, deve aparece nome da empresa, cnpj, endereço, cidade, estado, usuario, ip.
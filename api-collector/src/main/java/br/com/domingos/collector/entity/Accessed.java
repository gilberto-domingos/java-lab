package br.com.domingos.collector.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Table(name = "accesseds")
@Entity(name = "accesseds")
@Data
public class Accessed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String login;
    @Column
    private String company_name;
    @Column
    private String cnpj;
    @Column
    private String city;
    @Column
    private String region;
    @Column
    private String country_name;
    @Column
    private String ip;
    @Column
    private String latitude;
    @Column
    private String longitude;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dateTime;
    @Column
    private String network;
    @Column(name = "versionn")
    private String version;
    @Column
    private String org;

}

package br.com.domingos.rabbitMQ_docker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private Integer order;
    private String product;
    private String clientName;
}

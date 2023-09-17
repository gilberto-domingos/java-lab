package br.com.domingos.rabbitMQ_docker.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
    private String name;
    private String fone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}






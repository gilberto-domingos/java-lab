package br.com.domingos.collector.dto;

import br.com.domingos.collector.entity.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record RegisterDTO(
        String login,
        String password,
        UserRole role,
        String name,
        String cnpj,
        String address,
        String num,
        String neighborhood,
        String cep,
        String city,
        String region,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime dateTime

) { }

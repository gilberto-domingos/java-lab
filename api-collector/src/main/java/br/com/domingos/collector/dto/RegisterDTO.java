package br.com.domingos.collector.dto;

import br.com.domingos.collector.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}

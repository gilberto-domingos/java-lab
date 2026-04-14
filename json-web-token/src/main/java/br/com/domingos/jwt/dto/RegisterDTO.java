package br.com.domingos.jwt.dto;

import br.com.domingos.jwt.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}

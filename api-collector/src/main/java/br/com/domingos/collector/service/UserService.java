package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll(User user);

    Optional<User> findByCnpj(String cnpj);

    Optional<User> findOptionalByLogin(String login);
}

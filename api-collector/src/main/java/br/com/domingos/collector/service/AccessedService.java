package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.Accessed;

import java.util.List;
import java.util.Optional;

public interface AccessedService {
    Accessed save(Accessed accessed);

    List<Accessed> findAll(Accessed accessed);

    Optional<Accessed> findByCnpj(String cnpj);
}

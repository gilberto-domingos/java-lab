package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.Accessed;

import java.util.List;

public interface AccessedService {
    Accessed save(Accessed accessed);

    List<Accessed> findAll(Accessed accessed);

    List<Accessed> findByCnpj(String cnpj);
}

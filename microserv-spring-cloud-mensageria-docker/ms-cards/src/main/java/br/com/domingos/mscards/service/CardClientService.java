package br.com.domingos.mscards.service;

import br.com.domingos.mscards.entity.CardClient;

import java.util.List;

public interface CardClientService {
    public List<CardClient> listCardByCpf(String cpf);
}

package br.com.domingos.msclient.service;

import br.com.domingos.msclient.entity.Client;

import java.util.Optional;

public interface ClientService {
    public Client save(Client client);
    public Optional<Client>findByCpf(String cpf);
}

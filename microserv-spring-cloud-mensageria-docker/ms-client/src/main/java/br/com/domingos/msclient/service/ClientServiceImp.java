package br.com.domingos.msclient.service;

import br.com.domingos.msclient.entity.Client;
import br.com.domingos.msclient.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImp implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Optional<Client> findByCpf(String cpf) {
        return this.clientRepository.findByCpf(cpf);
    }


}

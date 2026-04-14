package br.com.domingos.mscards.service;

import br.com.domingos.mscards.entity.CardClient;
import br.com.domingos.mscards.repository.CardClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardClientServiceImp implements CardClientService {

    private final CardClientRepository cardClientRepository;


    @Override
    public List<CardClient> listCardByCpf(String cpf) {
        return this.cardClientRepository.findByCpf(cpf);
    }
}

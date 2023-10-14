package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.Accessed;
import br.com.domingos.collector.repository.AccessedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccessedServiceImp implements AccessedService{

    private final AccessedRepository accessedRepository;


    @Override
    public Accessed save(Accessed accessed) {
        return this.accessedRepository.save(accessed);
    }

    @Override
    public List<Accessed> findAll(Accessed accessed) {
        return this.accessedRepository.findAll();
    }

    @Override
    public List<Accessed> findByCnpj(String cnpj) {
        return null;
    }


}

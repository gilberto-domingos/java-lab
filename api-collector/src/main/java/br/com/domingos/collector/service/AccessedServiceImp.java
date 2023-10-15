package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.Accessed;
import br.com.domingos.collector.exception.ObjectNotFoundException;
import br.com.domingos.collector.repository.AccessedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccessedServiceImp implements AccessedService {

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
    public Optional<Accessed> findByCnpj(String cnpj) {
        Optional<Accessed> accessed = this.accessedRepository.findAllByCnpj(cnpj);

        if (!accessed.isPresent()) {
            throw new ObjectNotFoundException("CNPJ não encontrado");
        }

        return accessed;
    }


}

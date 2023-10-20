package br.com.domingos.collector.service;

import br.com.domingos.collector.entity.Accessed;
import br.com.domingos.collector.entity.User;
import br.com.domingos.collector.exception.ObjectNotFoundException;
import br.com.domingos.collector.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll(User user) {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findByCnpj(String cnpj) {
        Optional<User> accessed = this.userRepository.findAllByCnpj(cnpj);

        if (!accessed.isPresent()) {
            throw new ObjectNotFoundException("CNPJ não encontrado");
        }

        return accessed;
    }
}

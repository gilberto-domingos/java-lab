package br.com.domingos.collector.repository;

import br.com.domingos.collector.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);

    Optional<User> findAllByCnpj(String cnpj);
}

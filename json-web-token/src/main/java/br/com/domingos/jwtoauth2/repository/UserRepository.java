package br.com.domingos.jwtoauth2.repository;

import br.com.domingos.jwtoauth2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

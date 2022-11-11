package br.com.api.jrd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.jrd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User>findByEmail(String email);

}

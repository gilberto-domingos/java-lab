package br.com.domingos.collector.repository;

import br.com.domingos.collector.entity.Accessed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccessedRepository extends JpaRepository<Accessed, Long> {
    Optional<Accessed> findAllByCnpj(String cnpj);
}

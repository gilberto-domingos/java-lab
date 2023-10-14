package br.com.domingos.collector.repository;

import br.com.domingos.collector.entity.Accessed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessedRepository extends JpaRepository<Accessed, Long> {
}

package br.com.domingos.jwtoauth2.repository;

import br.com.domingos.jwtoauth2.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel,Long> {
}

package br.com.domingos.jwtoauth2.service;



import br.com.domingos.jwtoauth2.entity.Channel;

import java.util.List;

public interface ChannelService {
    Channel save(Channel channel);

    List<Channel> findAll(Channel channel);
}

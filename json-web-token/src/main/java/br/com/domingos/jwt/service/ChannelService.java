package br.com.domingos.jwt.service;



import br.com.domingos.jwt.entity.Channel;

import java.util.List;

public interface ChannelService {
    Channel save(Channel channel);

    List<Channel> findAll(Channel channel);
}

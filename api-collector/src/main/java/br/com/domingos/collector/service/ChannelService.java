package br.com.domingos.collector.service;



import br.com.domingos.collector.entity.Channel;

import java.util.List;

public interface ChannelService {
    Channel save(Channel channel);

    List<Channel> findAll(Channel channel);
}

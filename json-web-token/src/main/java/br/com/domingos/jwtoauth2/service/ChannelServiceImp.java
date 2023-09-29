package br.com.domingos.jwtoauth2.service;

import java.util.List;


import br.com.domingos.jwtoauth2.repository.ChannelRepository;
import br.com.domingos.jwtoauth2.entity.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChannelServiceImp implements ChannelService {

    private ChannelRepository channelRepository;

    @Autowired
    public ChannelServiceImp(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    @Override
    public Channel save(Channel channel) {
        return this.channelRepository.save(channel);
    }

    @Override
    public List<Channel> findAll(Channel channel) {
        return this.channelRepository.findAll();
    }

}

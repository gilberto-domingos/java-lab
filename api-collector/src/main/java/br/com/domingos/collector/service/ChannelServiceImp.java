package br.com.domingos.collector.service;

import java.util.List;


import br.com.domingos.collector.repository.ChannelRepository;
import br.com.domingos.collector.entity.Channel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ChannelServiceImp implements ChannelService {

    private final ChannelRepository channelRepository;

    @Override
    public Channel save(Channel channel) {
        return this.channelRepository.save(channel);
    }

    @Override
    public List<Channel> findAll(Channel channel) {
        return this.channelRepository.findAll();
    }

}

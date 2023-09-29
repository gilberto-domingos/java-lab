package br.com.domingos.jwtoauth2.controller;

import br.com.domingos.jwtoauth2.entity.Channel;
import br.com.domingos.jwtoauth2.service.ChannelServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/channels")
public class ChannelController {
	
	private ChannelServiceImp channelService;
	
	@Autowired
	public ChannelController(ChannelServiceImp channelService) {
		this.channelService = channelService;
	}
	
	@GetMapping
	public ResponseEntity<List<Channel>>findAll(Channel channel){
		List<Channel>channels = this.channelService.findAll(channel);
		
		return ResponseEntity.ok(channels);
	}
	
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Channel channel) {
	    this.channelService.save(channel);
	    return ResponseEntity.ok(channel);
	}
	
	

}

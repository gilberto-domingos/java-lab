package br.com.domingos.collector.controller;

import br.com.domingos.collector.entity.Channel;
import br.com.domingos.collector.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/channels")
public class ChannelController {
	
	private final ChannelService channelService;

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

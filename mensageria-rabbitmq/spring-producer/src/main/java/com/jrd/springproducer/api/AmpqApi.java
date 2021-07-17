package com.jrd.springproducer.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.springproducer.dto.Message;
import com.jrd.springproducer.service.AmpqService;

@RestController
public class AmpqApi {

	private AmpqService service;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/send")
	public void sendToConsumer(@RequestBody Message message) {
		service.sendToConsumer(message);
	}
}

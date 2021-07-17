package com.jrd.springproducer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.springproducer.ampq.AmpqProducer;
import com.jrd.springproducer.dto.Message;
import com.jrd.springproducer.service.AmpqService;

@Service
public class RabbitMQServiceImpl implements AmpqService  {
	
	@Autowired
	private AmpqProducer<Message> ampq;

	@Override
	public void sendToConsumer(Message message) {
		ampq.producer(message);
	}

}

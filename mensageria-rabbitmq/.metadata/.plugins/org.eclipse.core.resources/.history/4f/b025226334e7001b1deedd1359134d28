package com.jrd.springproducer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.springproducer.ampq.AmpqProducer;
import com.jrd.springproducer.dto.MessageQueue;
import com.jrd.springproducer.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService  {
	
	@Autowired
	private AmpqProducer<MessageQueue> ampq;

	@Override
	public void sendToConsumer(MessageQueue message) {
		ampq.producer(message);
	}

}

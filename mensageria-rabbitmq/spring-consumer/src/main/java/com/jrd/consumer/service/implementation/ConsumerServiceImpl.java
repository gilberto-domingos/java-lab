package com.jrd.consumer.service.implementation;

import org.springframework.stereotype.Service;

import com.jrd.consumer.dto.MessageQueue;
import com.jrd.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {	
	

	@Override
	public void action(MessageQueue messageQueue) {
		System.out.println(messageQueue.getText());
	}

}

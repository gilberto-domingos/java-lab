package com.jrd.springproducer.service;

import com.jrd.springproducer.dto.MessageQueue;

public interface AmqpService {
	void sendToConsumer(MessageQueue message);

}

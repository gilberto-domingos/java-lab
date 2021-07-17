package com.jrd.springproducer.service;

import com.jrd.springproducer.dto.Message;

public interface AmpqService {
	void sendToConsumer(Message message);

}

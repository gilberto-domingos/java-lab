package com.jrd.consumer.service;

import com.jrd.consumer.dto.MessageQueue;

public interface ConsumerService {
	
   public void action(MessageQueue messageQueue) throws Exception;
}

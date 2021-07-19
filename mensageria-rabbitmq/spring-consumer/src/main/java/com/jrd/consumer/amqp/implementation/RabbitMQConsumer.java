package com.jrd.consumer.amqp.implementation;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrd.consumer.amqp.AmqpConsumer;
import com.jrd.consumer.dto.MessageQueue;
import com.jrd.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageQueue> {
	
	@Autowired
	private ConsumerService consumerService;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consumer(MessageQueue messageQueue) {
		consumerService.action(messageQueue);
		
	}
}

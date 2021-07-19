package com.jrd.consumer.amqp;

public interface AmqpConsumer<T> {
	
	public void consumer(T t);
}

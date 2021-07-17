package com.jrd.springproducer.ampq;

public interface AmpqProducer<T> {
	void producer(T t);
}

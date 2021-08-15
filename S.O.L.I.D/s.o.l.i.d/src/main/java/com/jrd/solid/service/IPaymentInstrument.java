package com.jrd.solid.service;

public interface IPaymentInstrument {
	
	public void validate()throws Exception;
	public void collectPayment();

}

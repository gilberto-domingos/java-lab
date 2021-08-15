package com.jrd.solid.service;

public class NubankMainPayment {

	public static void main(String[] args) throws Exception {
		NubankCreditCar card = new NubankCreditCar();
		
		card.validate();
		card.collectPayment();

	}

}

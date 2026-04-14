package com.jrd.solid.service;

public class NubankMainPayment {

	public static void main(String[] args) throws Exception {
		
		NubankRewards rewards = new NubankRewards();
		
		
		rewards.validate();	
		rewards.collectPayment();
		
/*		NubankCreditCar creditCard = new NubankCreditCar();
		NubankDebitCard debitCard = new NubankDebitCard();		
		creditCard.validate();	
		creditCard.collectPayment();		
		debitCard.validate();	
		debitCard.collectPayment(); */

	}

}

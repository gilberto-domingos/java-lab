package com.jrd.solid.service;

public class NubankCreditCar extends NubankCard {
	
	@Override
	public void validate()throws Exception{
		// validação cartã de cretido
		System.out.println("Validando o limite");
		System.out.println("Limite Ok ! ");
	}
}

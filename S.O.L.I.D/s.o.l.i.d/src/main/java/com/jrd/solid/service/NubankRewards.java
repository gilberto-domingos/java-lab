	package com.jrd.solid.service;

public class NubankRewards implements IPaymentInstrument {

	@Override
	public void validate() throws Exception {
		// validações
		System.out.println("Limite Ok ! Rewards Ok !");
		
	}

	@Override
	public void collectPayment() {
		System.out.println("Pagamento realizado com sucesso !");
		System.out.println("Pontuação creditada no programa Rewards !");
	}

}

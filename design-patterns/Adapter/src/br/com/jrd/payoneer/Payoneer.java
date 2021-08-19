package br.com.jrd.payoneer;

import br.com.jrd.util.Token;

public class Payoneer implements IPayoneerPayments {

	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void sendPayment() {
		System.out.println("Enviando pagamento via payoneer");
	}

	@Override
	public void receivePayment() {
		System.out.println("Recebento pagamento via payonner");

	}

}

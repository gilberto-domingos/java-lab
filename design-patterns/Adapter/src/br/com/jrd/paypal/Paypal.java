package br.com.jrd.paypal;

import br.com.jrd.util.Token;

public class Paypal implements IPaypalPayments{
	
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.token = authToken();
		System.out.println("Enviando pagamento via paypal");
		
	}

	@Override
	public void paypalReceive() {
		System.out.println("Recebendo pagamento via paypal");
		
	}

}

package br.com.jrd.payoneer;

import br.com.jrd.util.Token;

public interface IPayoneerPayments {
	Token authToken();
	public void sendPayment();
	public void receivePayment();
	

}

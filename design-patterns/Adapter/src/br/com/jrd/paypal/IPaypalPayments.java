package br.com.jrd.paypal;

import br.com.jrd.util.Token;

public interface IPaypalPayments {

	Token authToken();
	public void paypalPayment();
	public void paypalReceive();
}

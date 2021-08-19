package br.com.jrd;

import br.com.jrd.adapter.PayoneerAdapter;
import br.com.jrd.payoneer.IPayoneerPayments;
import br.com.jrd.payoneer.Payoneer;
import br.com.jrd.paypal.IPaypalPayments;
import br.com.jrd.paypal.Paypal;

public class Main {

	public static void main(String[] args) {
		
		IPaypalPayments pays = new PayoneerAdapter(new Payoneer());
		pays.paypalPayment();
		pays.paypalReceive();		
		
	
	/*	IPayoneerPayments payoneerpay = new Payoneer();
		payoneerpay.sendPayment();
		payoneerpay.receivePayment();
		
		
			IPaypalPayments payment = new Paypal();
		payment.paypalPayment();
		payment.paypalReceive(); */

	}

}

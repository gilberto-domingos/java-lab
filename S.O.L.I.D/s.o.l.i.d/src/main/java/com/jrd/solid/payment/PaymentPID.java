package com.jrd.solid.payment;

import com.jrd.solid.entity.MySqlProductPID;

// classe de alto nível chamando a classe de alto nível
public class PaymentPID {

	public void pay(String productID) {
		
		MySqlProductPID dbProduct = new MySqlProductPID();
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}
}

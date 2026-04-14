package com.jrd.solid.payment;

import com.jrd.solid.entity.Db;
import com.jrd.solid.entity.ProductDbPID;
import com.jrd.solid.factory.DbProductFactory;

// classe de alto nível chamando a classe de alto nível
public class PaymentPID {

	public void pay(String productID) {
		
		ProductDbPID dbProduct = DbProductFactory.create(Db.MYSQL);
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}
}

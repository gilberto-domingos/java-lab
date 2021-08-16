package com.jrd.solid.entity;

public class NoSqlProductPID  implements ProductDbPID {

	public String getProductById(String productId) {
		return "NoSql: Exibindo dados do produto" + productId;
	}
}

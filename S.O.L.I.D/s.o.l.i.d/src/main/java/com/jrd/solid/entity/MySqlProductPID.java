package com.jrd.solid.entity;

// classe baixo nível
public class MySqlProductPID implements ProductDbPID {

	public String getProductById(String productId) {
		return "MySql: Exibindo dados do produto" + productId;
	}

}

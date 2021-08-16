package com.jrd.solid.factory;

import com.jrd.solid.entity.Db;
import com.jrd.solid.entity.MySqlProductPID;
import com.jrd.solid.entity.NoSqlProductPID;
import com.jrd.solid.entity.ProductDbPID;

public class DbProductFactory {

	public static ProductDbPID create(Db type) {

		if (type == Db.MYSQL) {
			return new MySqlProductPID();
		} else {
			return new NoSqlProductPID();
		}

	}

}

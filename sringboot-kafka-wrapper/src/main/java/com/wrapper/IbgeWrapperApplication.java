package com.wrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IbgeWrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbgeWrapperApplication.class, args);
	}

}
 	
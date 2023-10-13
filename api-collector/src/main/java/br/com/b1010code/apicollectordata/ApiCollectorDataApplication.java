package br.com.b1010code.apicollectordata;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ApiCollectorDataApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApiCollectorDataApplication.class, args);
	}

}

package com.wrapper.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.wrapper.gateway.feign.EstadoClient;
import com.wrapper.gateway.json.EstadoJson;

import feign.Feign;
import feign.gson.GsonDecoder;

@Service
public class ConsultarEstadoService {
	
	public List<EstadoJson> execute() {

		EstadoClient github = Feign.builder()
				.decoder(new GsonDecoder())
				.target(EstadoClient.class,
				"https://servicodados.ibge.gov.br/");
		
		return github.get();
		
		
	}

}

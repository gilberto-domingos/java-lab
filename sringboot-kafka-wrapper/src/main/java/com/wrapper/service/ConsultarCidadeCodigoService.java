package com.wrapper.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.wrapper.gateway.feign.CidadeClient;
import com.wrapper.gateway.json.CidadeJson;
import feign.Feign;
import feign.gson.GsonDecoder;

@Service
public class ConsultarCidadeCodigoService {

	public List<CidadeJson> execute(String estado) {
		CidadeClient github = Feign.builder()
								   .decoder(new GsonDecoder())
								   .target(CidadeClient.class,
				"https://servicodados.ibge.gov.br/");

		return github.get(estado);
	}

}

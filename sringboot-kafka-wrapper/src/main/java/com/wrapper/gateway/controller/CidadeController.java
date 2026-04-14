package com.wrapper.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wrapper.gateway.json.CidadeJson;
import com.wrapper.gateway.json.EstadoJson;
import com.wrapper.service.ConsultarCidadeCodigoService;
import com.wrapper.service.ConsultarEstadoService;

@RestController
@RequestMapping("/api")
public class CidadeController {

	@Autowired
	private ConsultarEstadoService consultarEstadoService;
	@Autowired
	private ConsultarCidadeCodigoService consultarCidadeCodigoService;

	public CidadeController(ConsultarEstadoService consultarEstadoService,
			ConsultarCidadeCodigoService consultarCidadeCodigoService) {
		this.consultarEstadoService = consultarEstadoService;
		this.consultarCidadeCodigoService = consultarCidadeCodigoService;
	}

	@GetMapping("/")
	public List<EstadoJson> consultarEstados() {
		return consultarEstadoService.execute();
	}

	@GetMapping("/{id}/cidades")
	public List<CidadeJson> consultarCidades(@PathVariable("id")String cidades) {
		return consultarCidadeCodigoService.execute(cidades);
	}

}

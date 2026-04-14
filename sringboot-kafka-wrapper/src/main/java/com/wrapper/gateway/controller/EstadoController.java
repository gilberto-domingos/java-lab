package com.wrapper.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wrapper.gateway.json.EstadoJson;
import com.wrapper.service.ConsultarEstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {

	@Autowired
	private ConsultarEstadoService consultarEstadoService;

	@GetMapping("/")
	public List<EstadoJson> consultar() {
		return consultarEstadoService.execute();

	}

}

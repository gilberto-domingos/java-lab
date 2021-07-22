package com.wrapper.gateway.feign;

import java.util.List;

import com.wrapper.gateway.json.CidadeJson;

import feign.Param;
import feign.RequestLine;

public interface CidadeClient {
	@RequestLine("GET /api/v1/localidades/estados/{UF}/municipios")
	List<CidadeJson> get(@Param("UF") String uf);
}

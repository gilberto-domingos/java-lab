package com.wrapper.gateway.feign;

import java.util.List;
import com.wrapper.gateway.json.EstadoJson;
import feign.RequestLine;

public interface EstadoClient {

	@RequestLine("GET /api/v1/localidades/estados")
	List<EstadoJson> get();

}

package br.com.jrd.transmission;

import br.com.jrd.platform.IPlatform;

public class Live implements ITransmission {

	protected IPlatform iplatform;

	public Live() {

	}

	public Live(IPlatform iplatform) {
       this.iplatform = iplatform;
	}

	@Override
	public void broadcasting() {
		System.out.println("Iniciando a transmissão");

	}

	@Override
	public void result() {
		System.out.println("******** ON AIR ********");

	}

}

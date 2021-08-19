package br.com.jrd.platform;

public class Youtube implements IPlatform {

	public Youtube() {
		configureRMTP();
		System.out.println("Youtube : Transmissão iniciada");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("Youtube : configurando Broadcasting");

	}

	@Override
	public void authToken() {
		System.out.println("Youtube : Autorizando aplicação");

	}

}

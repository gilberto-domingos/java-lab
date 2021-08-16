package br.com.jrd;

import br.com.jrd.app.Application;
import br.com.jrd.factory.ITransportFactory;
import br.com.jrd.factory.NineNineTransport;
import br.com.jrd.factory.UberTransport;

public class Main {
	
	public static Application configuraApplication() {
		Application app;
		
		ITransportFactory factory;
		
			String company = "uber";
			
			if (company == "uber") {
				factory = new UberTransport();
			} else {
                factory = new NineNineTransport();
			}
			
			app = new Application(factory);
			
			return app;
			
	}

	public static void main(String[] args) {
		Application app = configuraApplication();
		app.startRoute();

	}

}

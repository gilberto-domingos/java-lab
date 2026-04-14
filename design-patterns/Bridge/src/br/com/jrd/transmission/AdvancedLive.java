package br.com.jrd.transmission;

import br.com.jrd.platform.IPlatform;

public class AdvancedLive extends Live{
	
	public AdvancedLive(IPlatform iplatform) {
		super.iplatform = iplatform;
	}
	
	public void subtitles() {
		System.out.println("Legendas ativadas na transmissão");
	}
	
	public void comments() {
		System.out.println("Comentários liberados na live");
	}

}

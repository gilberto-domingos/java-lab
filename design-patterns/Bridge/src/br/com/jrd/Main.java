package br.com.jrd;

import br.com.jrd.platform.Facebook;
import br.com.jrd.platform.IPlatform;
import br.com.jrd.platform.TwitchTV;
import br.com.jrd.platform.Youtube;
import br.com.jrd.transmission.AdvancedLive;
import br.com.jrd.transmission.Live;

public class Main {

	public static void main(String[] args) {
		
		startAdvancedLive(new Youtube());
		startAdvancedLive(new TwitchTV());
		startAdvancedLive(new Facebook()); 
		
	/*	startLive(new Youtube());
		startLive(new TwitchTV());
		startLive(new Facebook()); */

	}
	
	//Live avançada
	public static void startAdvancedLive(IPlatform platform) {
		System.out.println("Transmissão avançada processando... Aguarde!");
		AdvancedLive advancedLive = new AdvancedLive(platform);
		advancedLive.broadcasting();
		advancedLive.comments();
		advancedLive.subtitles();
		advancedLive.result();
	}
	
	
	// Live simples
	public static void startLive(IPlatform platform) {
		System.out.println("Processando... Aguarde!");
		Live live = new Live(platform);
		live.broadcasting();
		live.result();
	}

}

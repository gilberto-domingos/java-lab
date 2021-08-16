package br.com.jrd.aircraft;

public class Helicopter implements IAircraft{

	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Iniciando, subindo vôo");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros no helicoptero, vôo autorizado !");		
	}

	@Override
	public void wind() {
		System.out.println("Ventos a 10Km, a sudeste ok !");
		
	}

}

package com.jrd.models.projection;

import com.jrd.models.Car;

public class CarConsumption { 
	
	
    private Car car;
	private double totalKmCidade;
	private double totalKmRodovia;
    private double preco;
	
	  public CarConsumption() {  }

	public CarConsumption(Car car, double totalKmCidade, double totalKmRodovia, double preco) {
		super();
		this.car = car;
		this.totalKmCidade = totalKmCidade;
		this.totalKmRodovia = totalKmRodovia;
		this.preco = preco;
	}


	public String getNome() {
		return this.car.getNome();
	}

	public String getMarca() {
		return this.car.getMarca();
	}


	public String getModelo() {
		return this.car.getModelo();
	}


	public String getAno() {
		return this.car.getDataFabricacao();
	}


	public double getQuantidadeCombustivelGasto() {

	return ( (this.totalKmCidade + this.totalKmRodovia) / ((this.car.getConsMedCids() + this.car.getConsMedRods()) / 2));
	
		
	}
	
	public double getValorTotalGastoComCombustivel() {
		
	  return  this.getQuantidadeCombustivelGasto() * preco;
		
	};
	  

}

 
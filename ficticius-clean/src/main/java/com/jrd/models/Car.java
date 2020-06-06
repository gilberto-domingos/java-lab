package com.jrd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cars")
public class Car {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String nome;
	  private String marca;
	  private String modelo;
	  private String dataFabricacao;
	  private double consMedCids;
	  private double consMedRods;
	
	  public Car() { }

	public Car(String nome, String marca, String modelo, String dataFabricacao, double consMedCids, double consMedRods) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.consMedCids = consMedCids;
		this.consMedRods = consMedRods;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public double getConsMedCids() {
		return consMedCids;
	}

	public double getConsMedRods() {
		return consMedRods;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public void setConsMedCids(double consMedCids) {
		this.consMedCids = consMedCids;
	}

	public void setConsMedRods(double consMedRods) {
		this.consMedRods = consMedRods;
	}
	
	

	@Override
	public String toString() {
		return "Car [nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", dataFabricacao=" + dataFabricacao
				+ ", consMedCids=" + consMedCids + ", consMedRods=" + consMedRods + "]";
	}

	
		  
	  
}

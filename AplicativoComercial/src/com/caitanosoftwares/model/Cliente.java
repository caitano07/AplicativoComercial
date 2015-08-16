package com.caitanosoftwares.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	
	String rg;
	String datanasc;
	Sexo sexo;
	EstadoCivil estadoCivil;
	public Cliente(){
				
	}
	
	public Cliente(String nome){
		this.nome=nome;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

}

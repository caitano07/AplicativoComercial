package com.caitanosoftwares.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Fornecedor extends Pessoa {
	
	String RazaoSocial;
	String pessoaContato;
	@ManyToOne(cascade=CascadeType.ALL)
	Produto produto;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	public String getPessoaContato() {
		return pessoaContato;
	}
	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}
	
	
	
	

}

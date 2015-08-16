package com.caitanosoftwares.service;

import java.util.List;

public interface Service<T> {

	public void salvar(T t);
	
	public void editar(T t);
	
	public void excluir(T t);
	
	public List<T> listar(String valor);
	
	
	
	
}

package com.caitanosoftwares.dao;

import java.util.List;

import com.caitanosoftwares.model.Fornecedor;

public interface FornecedorDao extends Dao<Fornecedor> {
	

	public void save(Fornecedor c);
	public Fornecedor getById(int id);
	public List<Fornecedor> list();
	public void remove(Fornecedor c);
	public void update(Fornecedor c);

}

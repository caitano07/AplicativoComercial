package com.caitanosoftwares.dao;

import java.util.List;

import com.caitanosoftwares.model.Produto;

public interface ProdutoDao extends Dao<Produto>{
	

	public void save(Produto p);
	public Produto getById(int id);
	public List<Produto> list();
	public List<Produto> list(String valor);
	public void remove(Produto p);
	public void update(Produto p);

}

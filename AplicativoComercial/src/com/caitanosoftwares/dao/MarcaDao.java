package com.caitanosoftwares.dao;

import java.util.List;

import com.caitanosoftwares.model.Marca;

public interface MarcaDao extends Dao<Marca> {
	

	public void save(Marca c);
	public Marca getById(int id);
	public List<Marca> list();
	public void remove(Marca c);
	public void update(Marca c);

}

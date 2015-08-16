package com.caitanosoftwares.dao;

import java.util.List;

import com.caitanosoftwares.model.Funcionario;

public interface FuncionarioDao extends Dao<Funcionario> {
	

	public void save(Funcionario c);
	public Funcionario getById(int id);
	public List<Funcionario> list();
	public void remove(Funcionario c);
	public void update(Funcionario c);

}

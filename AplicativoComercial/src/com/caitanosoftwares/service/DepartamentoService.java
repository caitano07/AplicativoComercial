package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.DepartamentoDao;
import com.caitanosoftwares.dao.DepartamentoDaoImp;
import com.caitanosoftwares.model.Departamento;

public class DepartamentoService implements Service<Departamento> {

	DepartamentoDao dao;

	@Override
	public void salvar(Departamento t) {

		dao = new DepartamentoDaoImp();
		dao.save(t);

	}

	@Override
	public void editar(Departamento t) {
		dao = new DepartamentoDaoImp();
		dao.update(t);

	}

	@Override
	public void excluir(Departamento t) {
		dao = new DepartamentoDaoImp();
		dao.remove(t);

	}

	@Override
	public List<Departamento> listar(String valor) {
		List<Departamento> lista = new DepartamentoDaoImp().list(valor);
		return lista;
	}

}

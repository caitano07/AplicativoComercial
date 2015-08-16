package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.CargoDao;
import com.caitanosoftwares.dao.CargoDaoImp;
import com.caitanosoftwares.model.Cargo;

public class CargoService implements Service<Cargo> {

	CargoDao dao;

	@Override
	public void salvar(Cargo t) {
		
		dao = new CargoDaoImp();
		dao.save(t);
	}

	@Override
	public void editar(Cargo t) {
dao = new CargoDaoImp();
dao.update(t);

	}

	@Override
	public void excluir(Cargo t) {
dao = new CargoDaoImp();
dao.remove(t);


	}

	@Override
	public List<Cargo> listar(String valor) {
		return new CargoDaoImp().list(valor);
		
	}

}

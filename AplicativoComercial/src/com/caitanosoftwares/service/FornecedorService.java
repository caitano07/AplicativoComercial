package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.FornecedorDao;
import com.caitanosoftwares.dao.FornecedorDaoImp;
import com.caitanosoftwares.model.Fornecedor;

public class FornecedorService implements Service<Fornecedor> {

	FornecedorDao dao;

	public FornecedorService() {
		dao=new FornecedorDaoImp(); 
		}
			
	@Override
	public void salvar(Fornecedor t) {

		dao.save(t);

	}

	@Override
	public void editar(Fornecedor t) {

		dao = new FornecedorDaoImp();
		dao.update(t);

	}

	@Override
	public void excluir(Fornecedor t) {
		dao.remove(t);
	}

	@Override
	public List<Fornecedor> listar(String valor) {

		List<Fornecedor> lista = new FornecedorDaoImp().list(valor);
		return lista;
	}

}

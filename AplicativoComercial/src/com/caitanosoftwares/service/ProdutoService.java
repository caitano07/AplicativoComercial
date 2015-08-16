package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.ProdutoDao;
import com.caitanosoftwares.dao.ProdutoDaoImp;
import com.caitanosoftwares.model.Produto;

public class ProdutoService implements Service<Produto> {

	ProdutoDao dao;

	public ProdutoService() {
		dao = new ProdutoDaoImp();
	}

	@Override
	public void salvar(Produto t) {
		dao.save(t);

	}

	@Override
	public void editar(Produto t) {
		dao.update(t);

	}

	@Override
	public void excluir(Produto t) {
		dao.remove(t);

	}

	@Override
	public List<Produto> listar(String valor) {
		return dao.list(valor);
	}

}

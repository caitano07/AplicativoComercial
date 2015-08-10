package service;

import java.util.List;

import model.Fornecedor;
import dao.FornecedorDao;
import dao.FornecedorDaoImp;

public class FornecedorService implements Service<Fornecedor> {

	FornecedorDao dao;

	public FornecedorService() {
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

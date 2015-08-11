package service;

import java.util.List;

import model.Departamento;
import dao.DepartamentoDao;
import dao.DepartamentoDaoImp;

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

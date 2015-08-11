package service;

import java.util.List;

import dao.FuncionarioDao;
import dao.FuncionarioDaoImp;
import model.Funcionario;

public class FuncionarioService implements Service<Funcionario> {

	FuncionarioDao dao;
	@Override
	public void salvar(Funcionario t) {
		dao = new FuncionarioDaoImp();
		dao.save(t);
		
	}

	@Override
	public void editar(Funcionario t) {
		dao = new FuncionarioDaoImp();
		dao.update(t);
		
	}

	@Override
	public void excluir(Funcionario t) {
		dao = new FuncionarioDaoImp();
		dao.remove(t);
		
	}

	@Override
	public List<Funcionario> listar(String valor) {
		return new FuncionarioDaoImp().list(valor);
	}

}

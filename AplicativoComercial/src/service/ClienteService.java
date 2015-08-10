package service;

import java.util.List;

import model.Cliente;
import dao.ClienteDao;
import dao.ClienteDaoImp;

public class ClienteService implements Service<Cliente>{

	ClienteDao dao;
	@Override
	public void salvar(Cliente t) {
		dao = new ClienteDaoImp();
		dao.save(t);
		
		
	}

	@Override
	public void editar(Cliente t) {

		dao = new ClienteDaoImp();
		dao.update(t);
		
	}

	@Override
	public void excluir(Cliente t) {

		dao = new ClienteDaoImp();
		dao.remove(t);
		
	}

	@Override
	public List<Cliente> listar(String valor) {
		List<Cliente> lista = new ClienteDaoImp().list(valor);
		return lista;
	}

}

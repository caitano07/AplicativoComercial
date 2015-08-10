
package service;

import java.util.List;

import model.Marca;
import dao.MarcaDao;
import dao.MarcaDaoImp;

public class MarcaService implements Service<Marca> {

	MarcaDao dao;
	
	public void salvar(Marca marca){
		dao = new MarcaDaoImp();
        dao.save(marca);		
	}
	
	public void excluir(Marca marca){
		dao = new MarcaDaoImp();
        dao.remove(marca);
	}
	
	public List<Marca> listar(String valor){
        List <Marca> lista = new MarcaDaoImp().list(valor);
		return lista;
	}
	
	public void editar(Marca marca){
		
		MarcaDao dao = new MarcaDaoImp();
        dao.update(marca);
		
	}
	
	
}

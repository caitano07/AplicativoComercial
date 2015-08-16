
package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.MarcaDao;
import com.caitanosoftwares.dao.MarcaDaoImp;
import com.caitanosoftwares.model.Marca;

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

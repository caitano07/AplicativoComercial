
package com.caitanosoftwares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.caitanosoftwares.dao.MarcaDaoImp;
import com.caitanosoftwares.model.Marca;

@org.springframework.stereotype.Service
public class MarcaService implements Service<Marca> {
	@Autowired
	MarcaDaoImp dao;
	
	public void salvar(Marca marca){
		
        dao.save(marca);		
	}
	
	public void excluir(Marca marca){
        dao.remove(marca);
	}
	
	public List<Marca> listar(String valor){
		return dao.list(valor);
		
	}
	
	public void editar(Marca marca){
		
        dao.update(marca);
		
	}

	public MarcaDaoImp getDao() {
		return dao;
	}

	public void setDao(MarcaDaoImp dao) {
		this.dao = dao;
	}


	
	
	
}

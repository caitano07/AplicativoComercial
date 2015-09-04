
package com.caitanosoftwares.service;

import java.util.List;

import com.caitanosoftwares.dao.MarcaDao;
import com.caitanosoftwares.dao.MarcaDaoImp;
import com.caitanosoftwares.model.Marca;

//@org.springframework.stereotype.Service
public class MarcaService implements Service<Marca> {
	//@Autowired
	MarcaDao dao = new MarcaDaoImp();
	
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

	public MarcaDao getDao() {
		return dao;
	}

	public void setDao(MarcaDaoImp dao) {
		this.dao = dao;
	}


	
	
	
}

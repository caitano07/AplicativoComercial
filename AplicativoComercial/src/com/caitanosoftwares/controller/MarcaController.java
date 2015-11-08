package com.caitanosoftwares.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.caitanosoftwares.model.Marca;
import com.caitanosoftwares.service.MarcaService;

@ManagedBean
@SessionScoped
public class MarcaController {

    List<Marca> lista = new ArrayList<Marca>();
    MarcaService service= new MarcaService();
    Marca marca;
    String pesq = "";

    public MarcaController() {
        marca = new Marca();

    }

    public String getPesq() {
        return pesq;
    }

    public void setPesq(String pesq) {
        this.pesq = pesq;
    }

    public List<Marca> getLista() {
        return lista;
    }

    public void setLista(List<Marca> lista) {
        this.lista = lista;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

	private void preencheList(){
		if(lista.size()==0){
	        lista = service.listar(pesq);
	    	}
		
	}
    
    public String adicionar() {
    	service.salvar(marca);
        marca = new Marca();
        return "marca?faces-redirect=true";
    }

    public void excluir(Marca m) {
    	service.excluir(m);
        }

    public List<Marca> listar() {
    	preencheList();
        return lista.stream().filter(
        		m->m.getNome().contains(pesq)).
        		collect(Collectors.toList());
    }

    public String alterar() {
    	service.editar(marca);
        marca = new Marca();
        return "marca?faces-redirect=true";
    }
    
    public String preparaAlteracao(Marca m){
    	marca=m;
        return "altMarca?faces-redirect=true";
    }
    
    public String preparaObjeto(){
    marca=new Marca();        
    return "marca?faces-redirect=true";
    }
    

}

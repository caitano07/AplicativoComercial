
package com.caitanosoftwares.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.caitanosoftwares.dao.DepartamentoDao;
import com.caitanosoftwares.dao.DepartamentoDaoImp;
import com.caitanosoftwares.model.Departamento;
import com.caitanosoftwares.service.DepartamentoService;

@ManagedBean
@SessionScoped
public class DepartamentoController {
	
	DepartamentoService service = new DepartamentoService();
    
    List<Departamento> lista = new ArrayList<Departamento>();
    Departamento d = new Departamento();
    String pesq="";

    public List<Departamento> getLista() {
        return lista;
    }

    public void setLista(List<Departamento> lista) {
        this.lista = lista;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }

    public String getPesq() {
        return pesq;
    }

    public void setPesq(String pesq) {
        this.pesq = pesq;
    }
    
    
    public String preparaObjeto(){
        setD(new Departamento());
      
    return "departamento?faces-redirect=true";
    }
    
    
    public String adicionar() {
        service.salvar(d);
        setD(new Departamento());
        return "departamento?faces-redirect=true";
    }
    
    public List<Departamento> listar() {
        lista = service.listar(pesq);
        return lista;
    }
    
    
    public String alterar() {
        service.editar(d);
        d = new Departamento();
        return "departamento?faces-redirect=true";
    }
    
    public String preparaAlteracao(Departamento m){
        setD(m);
        return "altDepartamento?faces-redirect=true";
    }
    
    public void excluir(Departamento m) {
service.excluir(m);
        
     
    }
    
}

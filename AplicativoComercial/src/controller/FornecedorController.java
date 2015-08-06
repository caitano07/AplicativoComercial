package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.ClienteDao;
import dao.ClienteDaoImp;
import dao.FornecedorDao;
import dao.FornecedorDaoImp;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;

@ManagedBean
@SessionScoped
public class FornecedorController {

	List<Fornecedor> lista = new ArrayList<Fornecedor>();
	Fornecedor forn;
	Endereco end;
	String pesq="";
	
	public FornecedorController(){
		forn = new Fornecedor();
		end = new Endereco();
		
	}
	
	
	public String getPesq() {
		return pesq;
	}


	public void setPesq(String pesq) {
		this.pesq = pesq;
	}


	public List<Fornecedor> getLista() {
		return lista;
	}
	public void setLista(List<Fornecedor> lista) {
		this.lista = lista;
	}
	public Fornecedor getForn() {
		return forn;
	}
	public void setForn(Fornecedor forn) {
		this.forn = forn;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	 public String preparaObjeto(){
	        setForn(new Fornecedor());
	        setEnd(new Endereco());
	        return "fornecedor?faces-redirect=true";
	    }
	 
	 public String adicionar() {
		 FornecedorDao c = new FornecedorDaoImp();
	        forn.setEndereco(end);
	        c.save(forn);
	        setForn(new Fornecedor());
	        setEnd(new Endereco());
	        return "fornecedor?faces-redirect=true";
	    }

	 public List<Fornecedor> listar() {
	        lista = new FornecedorDaoImp().list(pesq);
	        return lista;
	    }
	 
	 public String preparaAlteracao(Fornecedor f){
	        setForn(f);
	        setEnd(f.getEndereco());
	        return "altFornecedor?faces-redirect=true";
	    }
	
	 public String alterar() {
	        FornecedorDao dao = new FornecedorDaoImp();
	        dao.update(forn);
	        setForn(new Fornecedor());
	        return "fornecedor?faces-redirect=true";
	    }
	 public void excluir(Fornecedor f) {

	        FornecedorDao dao = new FornecedorDaoImp();
	        dao.remove(f);
	        
	    }
	
}
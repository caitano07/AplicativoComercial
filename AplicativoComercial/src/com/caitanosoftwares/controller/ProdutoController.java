package com.caitanosoftwares.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.caitanosoftwares.dao.FornecedorDaoImp;
import com.caitanosoftwares.dao.MarcaDaoImp;
import com.caitanosoftwares.model.Fornecedor;
import com.caitanosoftwares.model.Marca;
import com.caitanosoftwares.model.Produto;
import com.caitanosoftwares.service.ProdutoService;

@ManagedBean
@SessionScoped
public class ProdutoController {
	
	Produto p;
	List<Produto> lista = new ArrayList<Produto>();
	String pesq="";
	ProdutoService service = new ProdutoService();
	Fornecedor fornecedor;
	
	public ProdutoController(){
		setP(new Produto());
		fornecedor= new Fornecedor();
	}
	
	public Produto getP() {
		return p;
	}
	public void setP(Produto p) {
		this.p = p;
	}
	public List<Produto> getLista() {
		return lista;
	}
	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	public String getPesq() {
		return pesq;
	}
	public void setPesq(String pesq) {
		this.pesq = pesq;
	}
	

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String preparaObjeto() {

		setP(new Produto());
		return "cadastroProduto?faces-redirect=true";
	}


	public List<Marca> completeMarca(String busca) {
		return new MarcaDaoImp().list(busca);
		
	}
	public List<Fornecedor> completeFornecedor(String busca) {
		return new FornecedorDaoImp().list(busca);
		
	}
	

	public String adicionar() {
		System.out.println("teste");
		p.getFornecedores().add(fornecedor);
		service.salvar(p);
		setP(new Produto());
		return "produto?faces-redirect=true";
	}

	

	public List<Produto> listar() {
		lista = service.listar(pesq);
		return lista;
	}
	

	public String alterar() {
		service.editar(p);
		setP(new Produto());
		return "produto?faces-redirect=true";
	}

	public String preparaAlteracao(Produto p) {
		setP(p);
		return "altProduto?faces-redirect=true";
	}
	

	public void excluir(Produto p) {
		service.excluir(p);
		setP(new Produto());
	}
	
	public void calculaPreco(){
		p.setVenda(p.getCusto()+((p.getMargem()/100)*p.getCusto()));
		p.setLucro(p.getVenda()-p.getCusto());
	}

	
}

package com.caitanosoftwares.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.caitanosoftwares.dao.CargoDaoImp;
import com.caitanosoftwares.dao.DepartamentoDaoImp;
import com.caitanosoftwares.dao.FuncionarioDao;
import com.caitanosoftwares.dao.FuncionarioDaoImp;
import com.caitanosoftwares.model.Cargo;
import com.caitanosoftwares.model.Departamento;
import com.caitanosoftwares.model.Endereco;
import com.caitanosoftwares.model.Funcionario;
import com.caitanosoftwares.service.CargoService;
import com.caitanosoftwares.service.FuncionarioService;

@ManagedBean
@SessionScoped
public class FuncionarioController {

	List<Funcionario> lista = new ArrayList<Funcionario>();
	Funcionario funcionario;
	Endereco end;
	String pesq = "";
	FuncionarioService service = new FuncionarioService();

	public FuncionarioController() {
		funcionario = new Funcionario();
		end = new Endereco();

	}

	public List<Funcionario> getLista() {
		return lista;
	}

	public void setLista(List<Funcionario> lista) {
		this.lista = lista;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public String getPesq() {
		return pesq;
	}

	public void setPesq(String pesq) {
		this.pesq = pesq;
	}

	public String preparaObjeto() {

		setFuncionario(new Funcionario());
		setEnd(new Endereco());
		return "funcionario?faces-redirect=true";
	}

	public String adicionar() {
		//funcionario.setDepartamento(funcionario.getCargo().getDepartamento());
		funcionario.setEndereco(end);
		service.salvar(funcionario);
		setFuncionario(new Funcionario());
		setEnd(new Endereco());
		return "funcionario?faces-redirect=true";
	}

	public List<Funcionario> listar() {
		lista = service.listar(pesq);
		return lista;
	}

	public String alterar() {
		service.editar(funcionario);
		funcionario = new Funcionario();
		return "funcionario?faces-redirect=true";
	}

	public String preparaAlteracao(Funcionario m) {
		funcionario = m;
		end = m.getEndereco();
		System.out.println(funcionario);
		System.out.println(m);
		return "altFuncionario?faces-redirect=true";
	}

	public void excluir(Funcionario func) {
		service.excluir(func);

	}

	public List<Cargo> cargoComplete(String busca) {

		return new CargoService().listar(busca);
	}

}

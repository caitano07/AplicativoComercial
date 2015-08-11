package controller;

import dao.CargoDao;
import dao.CargoDaoImp;
import dao.DepartamentoDaoImp;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import service.CargoService;
import model.Cargo;
import model.Departamento;

;

@ManagedBean
@SessionScoped
public class CargoController {

	List<Cargo> lista = new ArrayList<Cargo>();
	Cargo cargo;
	Departamento departamento;
	String pesq = "";
	CargoService service = new CargoService();

	public CargoController() {
		super();
		setCargo(new Cargo());
		setDepartamento(new Departamento());
	}

	public List<Cargo> getLista() {
		return lista;
	}

	public void setLista(List<Cargo> lista) {
		this.lista = lista;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getPesq() {
		return pesq;
	}

	public void setPesq(String pesq) {
		this.pesq = pesq;
	}

	public String preparaObjeto() {

		setCargo(new Cargo());
		setDepartamento(new Departamento());
		return "cargo?faces-redirect=true";
	}

	public List<Departamento> complete(String busca) {
		List<Departamento> list = new DepartamentoDaoImp().list(busca);
		return list;
	}

	public String adicionar() {

		cargo.setDepartamento(departamento);
		service.salvar(cargo);
		setCargo(new Cargo());
		setDepartamento(new Departamento());
		return "cargo?faces-redirect=true";
	}

	public List<Cargo> listar() {
		lista = service.listar(pesq);
		return lista;
	}

	public String alterar() {
		cargo.setDepartamento(departamento);
		service.editar(cargo);
		setCargo(new Cargo());
		setDepartamento(new Departamento());
		return "cargo?faces-redirect=true";
	}

	public String preparaAlteracao(Cargo m) {
		setCargo(m);
		setDepartamento(m.getDepartamento());
		return "altCargo?faces-redirect=true";
	}

	public void excluir(Cargo m) {
		service.excluir(m);

	}
}

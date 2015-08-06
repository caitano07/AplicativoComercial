package controller;

import dao.DepartamentoDaoImp;
import dao.CargoDaoImp;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


import dao.FuncionarioDao;
import dao.FuncionarioDaoImp;
import model.Cargo;
import model.Departamento;
import model.Funcionario;
import model.Endereco;

@ManagedBean
public class FuncionarioController {

	List<Funcionario> lista = new ArrayList<Funcionario>();
	Funcionario funcionario;
	Endereco end;
	String pesq = "";

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
            
                System.out.println(funcionario+" sendo limpo");
		setFuncionario(new Funcionario());
		setEnd(new Endereco());
		return "funcionario?faces-redirect=true";
	}

	public String adicionar() {
		FuncionarioDao c = new FuncionarioDaoImp();
                funcionario.setDepartamento(funcionario.getCargo().getDepartamento());
		funcionario.setEndereco(end);
		c.save(funcionario);
		setFuncionario(new Funcionario());
		setEnd(new Endereco());
		return "funcionario?faces-redirect=true";
	}

	public List<Funcionario> listar() {
		lista = new FuncionarioDaoImp().list(pesq);
		return lista;
	}

	public String alterar() {
		FuncionarioDao dao = new FuncionarioDaoImp();
		dao.update(funcionario);
		funcionario = new Funcionario();
		return "funcionario?faces-redirect=true";
	}

	public String preparaAlteracao(Funcionario m) {
                funcionario=m;
                end=m.getEndereco();
                System.out.println(funcionario);
                System.out.println(m);
		return "altFuncionario?faces-redirect=true";
	}
        
	public void excluir(Funcionario m) {

		FuncionarioDao dao = new FuncionarioDaoImp();
		dao.remove(m);

    }
         public List<Cargo> cargoComplete(String busca) {
        List<Cargo> list = new CargoDaoImp().list(busca);
        return list;
    }
         
         


}

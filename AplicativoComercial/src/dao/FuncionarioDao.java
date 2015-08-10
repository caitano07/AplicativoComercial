package dao;

import java.util.List;

import model.Funcionario;

public interface FuncionarioDao extends Dao<Funcionario> {
	

	public void save(Funcionario c);
	public Funcionario getById(int id);
	public List<Funcionario> list();
	public void remove(Funcionario c);
	public void update(Funcionario c);

}

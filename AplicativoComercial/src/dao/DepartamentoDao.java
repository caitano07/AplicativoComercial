package dao;

import java.util.List;

import model.Departamento;

public interface DepartamentoDao {
	

	public void save(Departamento e);
	public Departamento getById(int id);
	public List<Departamento> list();
	public void remove(Departamento c);
	public void update(Departamento c);

}

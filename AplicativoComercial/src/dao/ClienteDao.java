package dao;

import java.util.List;

import model.Cliente;
import model.Endereco;

public interface ClienteDao extends Dao<Cliente> {
	

	public void save(Cliente c);
	public Cliente getById(int id);
	public List<Cliente> list();
	public void remove(Cliente c);
	public void update(Cliente c);

}

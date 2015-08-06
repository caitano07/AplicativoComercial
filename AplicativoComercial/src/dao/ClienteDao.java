package dao;

import java.util.List;

import model.Cliente;
import model.Endereco;

public interface ClienteDao {
	

	public void save(Cliente c,Endereco e);
	public Cliente getMarca(long id);
	public List<Cliente> list();
	public void remove(Cliente c);
	public void update(Cliente c);

}

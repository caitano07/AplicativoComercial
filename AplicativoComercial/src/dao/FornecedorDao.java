package dao;

import java.util.List;

import model.Fornecedor;

public interface FornecedorDao {
	

	public void save(Fornecedor c);
	public Fornecedor getFornecedor(long id);
	public List<Fornecedor> list();
	public void remove(Fornecedor c);
	public void update(Fornecedor c);

}

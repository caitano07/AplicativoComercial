package dao;

import java.util.List;

import model.Marca;

public interface MarcaDao {
	

	public void save(Marca c);
	public Marca getMarca(long id);
	public List<Marca> list();
	public void remove(Marca c);
	public void update(Marca c);

}

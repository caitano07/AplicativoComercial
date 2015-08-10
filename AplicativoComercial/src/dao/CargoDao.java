package dao;

import java.util.List;

import model.Cargo;

public interface CargoDao extends Dao<Cargo> {
	

	public void save(Cargo c);
	public Cargo getById(int id);
	public List<Cargo> list();
	public void remove(Cargo c);
	public void update(Cargo c);

}

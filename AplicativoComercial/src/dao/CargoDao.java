package dao;

import java.util.List;

import model.Cargo;

public interface CargoDao {
	

	public void save(Cargo c);
	public Cargo getCargo(int id);
	public List<Cargo> list();
	public void remove(Cargo c);
	public void update(Cargo c);

}

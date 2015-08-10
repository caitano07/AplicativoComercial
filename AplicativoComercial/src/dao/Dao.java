package dao;

import java.util.List;



public interface Dao<T> {


	public void save(T c);
	public T getById(int id);
	public List<T> list();
	public void remove(T c);
	public void update(T c);
	
}

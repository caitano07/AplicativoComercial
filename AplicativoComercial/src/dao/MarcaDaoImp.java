package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil2;
import model.Marca;
import java.util.List;

public class MarcaDaoImp implements MarcaDao {


	public void save(Marca c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c);
		t.commit();
		
	}


	public Marca getById(int id) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        return (Marca) session.load(Marca.class, id);


	}


	public List<Marca> list(String var) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Marca where nome like '%"+var+"%'").list();
        t.commit();
        return lista;

		
	}
        
        
	public List<Marca> list() {
        return null;
        }
        
        
	public void remove(Marca c) {


        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        t.commit();

		
	}


	public void update(Marca c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        t.commit();

		
		
	}


	

}

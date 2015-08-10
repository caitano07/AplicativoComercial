package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil2;
import model.Cliente;
import model.Endereco;
import java.util.List;

public class ClienteDaoImp implements ClienteDao {


	public void save(Cliente c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c.getEndereco());
		session.save(c);
		t.commit();
		
	}


	public Cliente getById(int id) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        return (Cliente) session.load(Cliente.class, id);


	}


	public List<Cliente> list(String var) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Cliente where nome like '%"+var+"%'").list();
        t.commit();
        return lista;
	}
        
        
	public List<Cliente> list() {
        return null;
        }
        
        
	public void remove(Cliente c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        session.delete(c.getEndereco());
        t.commit();

		
	}


	public void update(Cliente c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        session.update(c.getEndereco());
        t.commit();

		
		
	}
	
	

}

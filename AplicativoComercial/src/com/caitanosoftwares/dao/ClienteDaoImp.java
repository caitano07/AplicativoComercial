package com.caitanosoftwares.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caitanosoftwares.model.Cliente;
import com.caitanosoftwares.model.Endereco;
import com.caitanosoftwares.util.HibernateUtil2;

import java.util.List;

public class ClienteDaoImp implements ClienteDao {


	public void save(Cliente c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
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
        t.commit();

		
	}


	public void update(Cliente c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        t.commit();

		
		
	}
	
	

}

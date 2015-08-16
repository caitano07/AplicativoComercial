package com.caitanosoftwares.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caitanosoftwares.model.Cargo;
import com.caitanosoftwares.util.HibernateUtil2;

import java.util.List;

public class CargoDaoImp implements CargoDao {


	public void save(Cargo c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c);
		t.commit();
		
	}


	public Cargo getById(int id) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Cargo c = (Cargo) session.load(Cargo.class, id);
        session.close();
        return c;


	}


	public List<Cargo> list(String var) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Cargo where nome like '%"+var+"%'").list();
        t.commit();
        return lista;
	}
        
        
	public List<Cargo> list() {
        return null;
        }
        
        
	public void remove(Cargo c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        t.commit();

		
	}


	public void update(Cargo c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        
        t.commit();

		
		
	}


        

}

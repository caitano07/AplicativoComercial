package com.caitanosoftwares.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caitanosoftwares.model.Departamento;
import com.caitanosoftwares.util.HibernateUtil2;

import java.util.List;

public class DepartamentoDaoImp implements DepartamentoDao {


	public void save(Departamento e) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		
	}


	public Departamento getById(int id) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Departamento d = (Departamento) session.load(Departamento.class, id);
        session.close();
        return d; 

	}


	public List<Departamento> list(String var) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Departamento where nome like '%"+var+"%'").list();
        t.commit();
        return lista;
	}
        
        
	public List<Departamento> list() {
            
		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Departamento").list();
        t.commit();
        return lista;
        }
        
        
	public void remove(Departamento c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        t.commit();

		
	}


	public void update(Departamento c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        t.commit();

		
		
	}
	
	

}

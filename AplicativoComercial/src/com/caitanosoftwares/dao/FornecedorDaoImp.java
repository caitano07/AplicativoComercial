package com.caitanosoftwares.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caitanosoftwares.model.Fornecedor;
import com.caitanosoftwares.util.HibernateUtil2;

public class FornecedorDaoImp implements FornecedorDao {

	@Override
	public void save(Fornecedor c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c);
		t.commit();

	}

	@Override
	public Fornecedor getById(int id) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Fornecedor f = (Fornecedor) session.load(Fornecedor.class, id);
		
		return f;
                
                
	}

	public List<Fornecedor> list(String var) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery(
				"from Fornecedor where nome like '%" + var + "%'").list();
		t.commit();
		return lista;
	}

	@Override
	public List<Fornecedor> list() {

		return null;
	}

	@Override
	public void remove(Fornecedor c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        t.commit();
	}

	@Override
	public void update(Fornecedor c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);

        t.commit();

	}

}

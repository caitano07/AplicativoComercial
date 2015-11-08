package com.caitanosoftwares.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caitanosoftwares.model.Produto;
import com.caitanosoftwares.util.HibernateUtil2;

public class ProdutoDaoImp implements ProdutoDao {

	@Override
	public void save(Produto p) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(p);
		t.commit();
		
	}

	@Override
	public Produto getById(int id) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Produto c = (Produto) session.load(Produto.class, id);
        session.close();
        return c;
	}

	@Override
	public List<Produto> list(String var) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Produto p inner join fetch p.marca where descricao like '%"+var+"%'").list();
        t.commit();
        session.close();
        return lista;
	}
	

	@Override
	public List<Produto> list(){
		return null;
	}

	@Override
	public void remove(Produto p) {
        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(p);
        t.commit();
        session.close();
		
	}

	@Override
	public void update(Produto p) {
        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(p);
        t.commit();
		
	}

}

package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil2;

import model.Fornecedor;

public class FornecedorDaoImp implements FornecedorDao {

	@Override
	public void save(Fornecedor c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c.getEndereco());
		session.save(c);
		t.commit();

	}

	@Override
	public Fornecedor getFornecedor(long id) {
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
        session.delete(c.getEndereco());
        t.commit();
	}

	@Override
	public void update(Fornecedor c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        session.update(c.getEndereco());
        t.commit();

	}

}

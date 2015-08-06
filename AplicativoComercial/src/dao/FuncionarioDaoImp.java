package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil2;
import model.Funcionario;
import java.util.List;

public class FuncionarioDaoImp implements FuncionarioDao {


	public void save(Funcionario c) {
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(c.getEndereco());
                session.save(c);
		t.commit();
		
	}


	public Funcionario getFuncionario(int id) {
        Session session = HibernateUtil2.getSessionFactory().openSession();
        return (Funcionario) session.load(Funcionario.class, id);


	}


	public List<Funcionario> list(String var) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Funcionario where nome like '%"+var+"%'").list();
        t.commit();
        return lista;
	}
        
        
	public List<Funcionario> list() {
        return null;
        }
        
        
	public void remove(Funcionario c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(c);
        t.commit();

		
	}


	public void update(Funcionario c) {

        Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(c);
        
        t.commit();

		
		
	}

        

}

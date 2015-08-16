package com.caitanosoftwares.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.caitanosoftwares.model.Marca;

public class HibernateUtil {

	
	private static SessionFactory sessionFactory;
	 
	public HibernateUtil() {
	}
	 
	public static SessionFactory getSessionFactory() {
		
	if (sessionFactory == null) {
		
	try {
	AnnotationConfiguration ac = new AnnotationConfiguration();
	ac.addAnnotatedClass(Marca.class);
	sessionFactory = ac.configure().buildSessionFactory();
	
	} catch (Throwable ex) {
	// Log the exception.
	System.out.println("ERRO : " + ex);
	throw new ExceptionInInitializerError(ex);
	}
	
	return sessionFactory;
	
	} else {
	return sessionFactory;
	}
	
	}
	
}

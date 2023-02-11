package com.simplilearn.movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MovieClient {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		try {
			
			AnnotationConfiguration afg = new AnnotationConfiguration();			
			afg = (AnnotationConfiguration) afg.configure();
			sessionFactory = afg.buildSessionFactory();			
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			//Movies movie = new Movies("Dracua Untold", 900, "Gary Shore");
			//Movies movie = new Movies("Harry Potter", 800, "Prashanth Neel");
			Movies movie = new Movies("KGF", 600, "RR");
			//String movieName, int moviePrice, String movieDirector
			
			session.save(movie);
			tx.commit();
			session.close();
			

		} catch (Exception e) {
			
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		
	}
}

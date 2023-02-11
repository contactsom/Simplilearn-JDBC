package com.simplilearn.movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MovieClientLoad {


	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		try {
			AnnotationConfiguration afg = new AnnotationConfiguration();			
			afg = (AnnotationConfiguration) afg.configure();
			sessionFactory = afg.buildSessionFactory();			
			Session session = sessionFactory.openSession();		
			Movies movies=(Movies) session.load(Movies.class,2);// feth the data by ID
			System.out.println(
						" Movie ID- "+movies.getMovieid()+" "+
						" Movie Name- "+movies.getMovieName()+" "+
						" Movie Price- "+movies.getMoviePrice()+" "+
						" Movie Director- "+movies.getMovieDirector());	
			session.close();

		} catch (Exception e) {
			
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		
	}


}

package com.simplilearn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CustomerInsert {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		try {
			
			AnnotationConfiguration afg = new AnnotationConfiguration();			
			afg = (AnnotationConfiguration) afg.configure();
			sessionFactory = afg.buildSessionFactory();			
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Customer cust = new Customer("Shivadimon420","Shivadimon420@simplilearn.com",4899,"Bang",3400.00);
			
			session.save(cust);
			tx.commit();
			session.close();
			

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		
	}
}

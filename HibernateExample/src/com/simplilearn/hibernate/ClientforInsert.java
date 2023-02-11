package com.simplilearn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientforInsert {

	public static void main(String[] args) {
	
		SessionFactory factory;
		Transaction tx = null;
		
		try {
		
			Configuration cfg = new Configuration();
			cfg = cfg.configure();
			factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			tx = session.beginTransaction();
			Customer cust = new Customer("om1", "om1@abc.com", 4899, "Bangalore1", 25000.00);
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

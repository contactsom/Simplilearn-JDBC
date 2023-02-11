package com.simplilearn.hibernate;

import org.hibernate.*;

public class Lab2Client1 {
	
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = AHibernateUtil.getsessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("prakas","om@simplilearn.com",4899,"Bang",3400.00);
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

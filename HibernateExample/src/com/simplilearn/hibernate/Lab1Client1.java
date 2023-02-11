package com.simplilearn.hibernate;


import org.hibernate.*;

public class Lab1Client1 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("om", "om@abc.com", 4899, "Bangalore", 25000.00);
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

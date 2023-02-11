package com.simplilearn.hibernate;

import org.hibernate.*;

public class Lab2Client2 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			
			SessionFactory sf = AHibernateUtil.getsessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust=(Customer) session.load(Customer.class,1);
			System.out.println(
					cust.getCname()+"\t"+
					cust.getEmail()+"\t"+
					cust.getPhone()+"\t"+
					cust.getCity()+"\t"+
					cust.getBal());
		
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}

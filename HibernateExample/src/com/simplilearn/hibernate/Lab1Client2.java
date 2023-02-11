package com.simplilearn.hibernate;


import org.hibernate.*;

public class Lab1Client2 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			//Customer cust = new Customer(1,"om", "om@gmail.com", 784784899,"Bangalore", 25000.00);
			
			Customer cust=(Customer) session.load(Customer.class,1);
			System.out.println(cust.getName()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getCity()+"\t"+cust.getBal());
			
			
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

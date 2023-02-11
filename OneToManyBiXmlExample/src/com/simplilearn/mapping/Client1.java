package com.simplilearn.mapping;

import java.util.*;

import org.hibernate.*;

public class Client1 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Order o1 = new Order(2, new Double(200.0), new Date(), "New");
			session.save(o1);

			Order o2 = new Order(3, new Double(300.0), new Date(), "New");
			session.save(o2);

			Order o3 = new Order(4, new Double(400.0), new Date(), "New");
			session.save(o3);

			Customer cust = new Customer("ds", "ds@abc", new Date(), new Long(
					9999));
			session.save(cust);

			o1.setCustomer(cust);
			o2.setCustomer(cust);
			o3.setCustomer(cust);
			tx.commit();
			session.close();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}
}

package com.simplilearn.mapping;

import org.hibernate.*;

public class CLab18Client1 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = AHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Student stu = new Student("RR", "RR@abc.com", "2222");
			session.save(stu);

			Address add = new Address("sss", "Hyd", "AP");
			session.save(add);
			stu.setAddress(add);
			tx.commit();
			session.close();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}
}

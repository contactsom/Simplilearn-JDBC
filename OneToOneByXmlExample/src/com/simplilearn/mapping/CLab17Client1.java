package com.simplilearn.mapping;

import org.hibernate.*;

public class CLab17Client1 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Student stu = new Student("abc", "abc@xyz.com", "2222");
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

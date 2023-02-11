package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentInsert {

	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory factory;

		try {

			Configuration cfg = new Configuration();
			cfg = cfg.configure();
			factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			
			String courses[] = { "java", "Jdbc", "Jsp" };

			List<String> emails = new ArrayList<String>();
			emails.add("rasumani96@abc");
			emails.add("devisri081995@abc");
			emails.add("Shivadimon420@abc");
			
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(new Integer(100));
			marks.add(new Integer(22));
			marks.add(new Integer(90));

			Set<Long> phone = new HashSet<Long>();
			phone.add(new Long(911111));
			phone.add(new Long(912222));
			phone.add(new Long(913333));

			Map<String, Long> studentReferance = new HashMap<String, Long>();

			studentReferance.put("rasumani96", new Long(911111));
			studentReferance.put("devisri081995", new Long(912222));
			studentReferance.put("Shivadimon420", new Long(913333));

			Student stu = new Student("Mohan", "04-09-13", "MCA", courses, emails,marks, phone, studentReferance);
			session.save(stu);
			
			
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();

		}
	}

}

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
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StudentInsert {

	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory factory;

		try {

			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg = (AnnotationConfiguration)cfg.configure();
			factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			
			String courses[] = { "java", "Jdbc", "Jsp" };

			List<String> emails = new ArrayList<String>();
			emails.add("rasumani9@abc");
			emails.add("devisri08995@abc");
			emails.add("Shivadimo420@abc");
			
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(new Integer(10));
			marks.add(new Integer(221));
			marks.add(new Integer(901));

			Set<Long> phone = new HashSet<Long>();
			phone.add(new Long(91111));
			phone.add(new Long(91222));
			phone.add(new Long(91333));

			Map<String, Long> studentReferance = new HashMap<String, Long>();

			studentReferance.put("rasumani9", new Long(91111));
			studentReferance.put("devisri08199", new Long(92222));
			studentReferance.put("Shivadimon42", new Long(91333));

			Student stu = new Student("Mohan1", "04-09-14", "BCA", courses, emails,marks, phone, studentReferance);
			
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

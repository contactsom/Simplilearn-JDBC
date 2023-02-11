package com.simplilearn.mapping;

import java.util.*;

import org.hibernate.*;

public class Lab3Client1 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			String cous[] = { "java", "Jdbc", "Jsp" };

			List<String> emails = new ArrayList<String>();
			emails.add("aa@abc");
			emails.add("bb@abc");
			emails.add("cc@abc");
			
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(new Integer(100));
			marks.add(new Integer(22));
			marks.add(new Integer(100));

			Set<Long> phone = new HashSet<Long>();
			phone.add(new Long(911111));
			phone.add(new Long(912222));
			phone.add(new Long(913333));

			Map<String, Long> studentReferance = new HashMap<String, Long>();

			studentReferance.put("aa", new Long(911111));
			studentReferance.put("bbb", new Long(912222));
			studentReferance.put("ccc", new Long(913333));

			Student stu = new Student("Mohan", "04-09-13", "MCA", cous, emails,marks, phone, studentReferance);
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

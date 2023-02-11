package com.simplilearn.mapping;

import org.hibernate.*;

public class Lab3Client2 {
	public static void main(String[] args) {
		Transaction tx = null;
		String ems;

		try {
			SessionFactory sf = AHibernateUtil.getsessionFactory();
			Session session = sf.openSession();
			 tx = session.beginTransaction();
			 Student stu=(Student) session.load(Student.class,1);
			 System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getQualification());
			 
			 for(String cn:stu.getCourses()){
				 System.out.println(cn);
			 }
			 
			 System.out.println(stu.getEmails());
			 System.out.println(stu.getMarks());
			 System.out.println(stu.getPhones());
			 System.out.println(stu.getRefs());
		
			 tx.commit();
			 session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}

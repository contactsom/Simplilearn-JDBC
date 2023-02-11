package com.simplilearn.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class CLab15Client2 {
	public static void main(String[] args) {
		Transaction tx = null;
		Student stu = null;
		try{
		SessionFactory sf = CHibernateUtil.getFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		
		 stu=(Student) session.load(Student.class,1);
		 //stu=(Student)session.get(Student.class,1);
		//System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getEmail()+"\t"+stu.getPhone());
		
		Address add=stu.getAddress();
		System.out.println(add.getAdid()+"\t"+add.getCity()+"\t"+add.getStreet()+"\t"+add.getState());
		
		//Address add1=(Address)session.load(Address.class,1);
		//System.out.println(add1.getAdid()+"\t"+add1.getCity()+"\t"+add1.getStreet()+"\t"+add1.getState());
	
	
	tx.commit();
		session.close();
			}catch(Exception e){
				e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
		//System.out.println(stu.getPhone()); 
		//System.out.println(stu.getAddress().getAdid());
		 
		
	}
}

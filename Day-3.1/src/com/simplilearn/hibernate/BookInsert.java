package com.simplilearn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookInsert {

	public static void main(String[] args) {
		
		SessionFactory factory;
		Transaction tx = null;
		
		try {
		// 1. Create the Configuration Object 
			Configuration cfg = new Configuration();
			
		// 2. Call the configure Method			
			cfg = cfg.configure();
			
		// 3. Through configuration call the buildSessionFactory()
			factory = cfg.buildSessionFactory();
			
		// 4. With factory object open the session
			Session session = factory.openSession();
		
		// 5. With the help of Session need to begin the transaction
			tx = session.beginTransaction();
		
		//6. Business Object 	
		
			Book book = new Book("Rich Dad Poor Dad",100, "Robert Kiyosaki");
			
		//7. Save the Data
		    session.save(book);// I am saving the Book object- Agree/ not-Agree
		    
		//8. Commit in DB
			tx.commit();
		
		//9. Close the Resources
		session.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	
		
	}
}

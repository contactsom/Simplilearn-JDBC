package com.simplilearn.mapping;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = AHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Customer cust = (Customer) session.load(Customer.class, 2);
			
			
			System.out.println(cust.getCid() + "\t" + cust.getCname() + "\t"
					+ cust.getEmail() + "\t" + cust.getPhone());

			Set<Account> acs = cust.getAccounts();
			for (Account acc : acs) {
				System.out.println(acc.getAccno() + "\t" + acc.getAtype()
						+ "\t" + acc.getBal());
			}
			Account ac = (Account) session.load(Account.class, 1);
			System.out.println(ac.getAccno() + "\t" + ac.getAtype() + "\t"
					+ ac.getBal());

			Set<Customer> ccs = ac.getCustomers();
			for (Customer cus : ccs) {
				System.out.println(cust.getCid() + "\t" + cust.getCname()
						+ "\t" + cust.getEmail() + "\t" + cust.getPhone());
			}

			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}

	}
}

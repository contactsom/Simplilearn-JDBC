package com.simplilearn.mapping;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2 {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = CHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			Customer cust=(Customer) session.load(Customer.class,1);
			
			System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getDob()+"\t"+cust.getOrders());
			
			Set<Order> orders=cust.getOrders();
			System.out.println(orders.getClass().getName());
			
			for(Order od:orders){
				System.out.println(od.getOrderId()+"\t"+od.getTotalQty()+"\t"+od.getTotalCost());
			}
			
			Order ord=(Order) session.load(Order.class,2);
			System.out.println(ord.getOrderId()+"\t"+ord.getTotalQty()+"\t"+ord.getTotalCost());
			
			Customer cus=ord.getCustomer();
			System.out.println(cus.getCid()+"\t"+cus.getCname()+"\t"+cus.getEmail());
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		}

	}
}

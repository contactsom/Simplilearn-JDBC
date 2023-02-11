package com.simplilearn.clients;

import com.simplilearn.dao.CustomerDAO;
import com.simplilearn.factory.DAOFactory;
import com.simplilearn.util.CustomerTO.CustomerTO;

public class GetCustomer {
	public static void main(String[] args) {
		CustomerDAO cdao=DAOFactory.getCustomerDAO();
		
		
		//2.Get Customer
		CustomerTO c1=cdao.getCustomerByCid(1);
		System.out.println(c1.getCid()+"\t"+c1.getCname()+"\t"+c1.getEmail()+"\t"+c1.getPhone()+"\t"+c1.getCity()+"\t"+c1.getStatus());
	}
}

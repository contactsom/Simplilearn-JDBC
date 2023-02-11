package com.simplilearn.clients;

import com.simplilearn.dao.CustomerDAO;
import com.simplilearn.factory.DAOFactory;
import com.simplilearn.util.CustomerTO.CustomerTO;

public class UpdateCustomer {
	public static void main(String[] args) {
		CustomerDAO cdao=DAOFactory.getCustomerDAO();
		
		
		//4.Update Customer
		//CustomerTO cust=1;
		CustomerTO c2= new CustomerTO();
		c2.setCid(1);
		c2.setCname("shashi");
		c2.setEmail("shashi@simplilearn.com");
		c2.setPhone(124);
		cdao.updateCustomer(c2);
	
	}
}

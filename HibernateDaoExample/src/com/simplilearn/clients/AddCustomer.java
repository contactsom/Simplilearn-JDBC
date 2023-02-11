package com.simplilearn.clients;

import com.simplilearn.dao.CustomerDAO;
import com.simplilearn.factory.DAOFactory;
import com.simplilearn.util.CustomerTO.CustomerTO;

public class AddCustomer {

	public static void main(String[] args) {
		
		CustomerDAO cdao=DAOFactory.getCustomerDAO();
		
		//1.Add Customer
		CustomerTO cto=new CustomerTO(0,"newjohn","john@abc.com",1121,"KN","Disabled");
		cdao.addCustomer(cto);
	}
}

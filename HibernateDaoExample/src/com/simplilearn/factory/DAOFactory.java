package com.simplilearn.factory;

import com.simplilearn.dao.CustomerDAO;
import com.simplilearn.dao.HibernateCustomerDAO;

public class DAOFactory {
	static CustomerDAO customerDAO;
	static {
		customerDAO = new HibernateCustomerDAO();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

}

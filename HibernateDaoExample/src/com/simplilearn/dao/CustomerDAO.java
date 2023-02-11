package com.simplilearn.dao;

import com.simplilearn.util.CustomerTO.CustomerTO;

public interface CustomerDAO {
	
	public int addCustomer(CustomerTO cust);

	public void updateCustomer(CustomerTO cust);

	public void deleteCustomer(int cid);
	
	public CustomerTO getCustomerByCid(int cid);

}

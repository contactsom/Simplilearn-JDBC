package com.simplilearn.dao;

import com.simplilearn.util.CustomerTO.CustomerTO;
import com.simplilearn.utill.CHibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO {

	@Override
	public int addCustomer(CustomerTO cto) {
		
		Customer cust=new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getStatus(),cto.getCity());
		Integer it=(Integer)CHibernateTemplate.saveobject(cust);
		return it.intValue();
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		CHibernateTemplate.updateObject(cust);
			
	}

	@Override
	public void deleteCustomer(int cid) {
		CHibernateTemplate.deleteObject(Customer.class, cid);
			
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer cust=(Customer)CHibernateTemplate.loadObject(Customer.class, cid);
		CustomerTO cto=new CustomerTO(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());
		return cto;
	}
	

}

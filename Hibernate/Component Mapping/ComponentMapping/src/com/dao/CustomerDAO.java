package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Address;
import com.bean.Customer;

public class CustomerDAO {
	
	private Session session;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public int addCustomer(Customer customer, Address address)
	{
		Transaction trans=session.beginTransaction();
		customer.setAddress(address);
		session.save(customer);
		trans.commit();
		return customer.getCustId();
	}
	
}

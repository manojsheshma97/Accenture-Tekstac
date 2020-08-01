package com.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bean.Customer;

public class CustomerDAO {
	
	private Session session;
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public int addCustomer(Customer customer)
	{
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
        return customer.getCustId();
		
	}
	

}

package com.dao;

import org.hibernate.*;
import com.bean.*;

public class CustomerDAO {
    private Session session;
    public Session getSession(){
        return session;
    }
    public void setSession(Session session){
        this.session = session;
    }
    public int createCustomer(Customer customer){
        Transaction transaction=session.beginTransaction();
        session.save(customer);
        transaction.commit();
        return customer.getCustomerId();
    }
	
}

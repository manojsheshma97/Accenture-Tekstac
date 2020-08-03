package com.dao;
import com.bean.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO {
    private Session session;
    public void setSession(Session session){
        this.session=session;
    }
    public Session getSession(){
        return session;
    }
    public Customer updateCustomer(int customerId,long newphoneno){
        Transaction transaction=session.beginTransaction();
        Customer cobj=(Customer)session.get(Customer.class,customerId);
        cobj.setPhoneNo(newphoneno);
        session.saveOrUpdate(cobj);
        transaction.commit();
        return cobj;
    }
	
}

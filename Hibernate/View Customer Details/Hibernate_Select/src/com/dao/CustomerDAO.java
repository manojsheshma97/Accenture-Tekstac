package com.dao;
import org.hibernate.*;
import com.bean.*;
import java.util.List;

public class CustomerDAO {
	private Session session;
	public Session getSession(){
	    return session;
	}
	public void setSession(Session session){
	    this.session=session;
	}
	public List<Customer> viewCustomers(){
	    String hql="From Customer c";
	    Query query=session.createQuery(hql);
	    List<Customer> list=query.list();
	    return list;
	}
}

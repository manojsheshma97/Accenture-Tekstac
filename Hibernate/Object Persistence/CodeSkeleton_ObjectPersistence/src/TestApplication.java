package com.bean;

import com.bean.*;
import com.dao.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		SessionFactory sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		CustomerDAO custDao = new CustomerDAO();
		custDao.setSession(session);
		Customer cust=new Customer();
		custDao.createCustomer(cust);
		
	}

}

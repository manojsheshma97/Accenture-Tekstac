package com.bean;
import com.dao.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class TestApplication {
    public static void main(String[] args){
        Configuration config=new Configuration();
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session sess=sf.openSession();
        CustomerDAO dao=new CustomerDAO();
        dao.setSession(sess);
        List<Customer> list=dao.viewCustomers();
        for(Customer customer:list){
            System.out.println(customer.getCustomerId());
            System.out.println(customer.getCustomerName());
        }
    }

}

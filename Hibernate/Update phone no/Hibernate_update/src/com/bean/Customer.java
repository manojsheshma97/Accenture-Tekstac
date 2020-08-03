package com.bean;
import javax.persistence.*;

@Entity
@Table(name="customer_master")

public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int customerId;
    private String customerName,emailId;
    private long phoneNo;
    
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public int getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmailId(){
        return emailId;
    }
    public long getPhoneNo(){
        return phoneNo;
    }

}

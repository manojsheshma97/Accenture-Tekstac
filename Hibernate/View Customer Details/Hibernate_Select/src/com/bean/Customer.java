package com.bean;
import javax.persistence.*;
@Entity
@Table(name="customer_master")

public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int customerId;
    private String customerName;
    private String emailId;
    private long phoneNo;
    
    public int getCustomerId(){
        return customerId;
    }
	public void setCustomerId(int customerId){
	    this.customerId=customerId;
	}
	public String getCustomerName(){
	    return customerName;
	}
	public void setCustomerName(String customerName){
	    this.customerName=customerName;
	}
	public String getEmailId(){
	    return emailId;
	}
	public void setEmailId(String emailId){
	    this.emailId=emailId;
	}
	public long getPhoneNo(){
	    return phoneNo;
	}
	public void setPhoneNo(long phoneNo){
	    this.phoneNo=phoneNo;
	}

}

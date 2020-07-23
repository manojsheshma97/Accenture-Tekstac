package com.spring.app;

public class Customer {
	private int custId;
	private String custName;
	private String emailId;
	private long contactNo;
	
	public void setCustId(int custId){
	    this.custId=custId;
	}
	public int getCustId(){
	    return custId;
	}
	public void setCustName(String custName){
	    this.custName=custName;
	}
	public String getCustName(){
	    return custName;
	}
	public void setEmailId(String emailId){
	    this.emailId=emailId;
	}
	public String getEmailId(){
	    return emailId;
	}
	public void setContactNo(long contactNo){
	    this.contactNo=contactNo;
	}
	public long getContactNo(){
	    return contactNo;
	}
}

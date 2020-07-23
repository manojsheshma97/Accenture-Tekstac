package com.spring.app;

public class FixedDeposit {

	private int accountNumber;
	private String accountHolderName;
	private float amt;
	private int tenure;
	private float interestRate;

	public void setAccountNumber(int accountNumber){
	    this.accountNumber=accountNumber;
	}
	public int getAccountNumber(){
	    return accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
	    this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName(){
	    return accountHolderName;
	}
	public void setAmt(float amt){
	    this.amt=amt;
	}
	public float getAmt(){
	    return amt;
	}
	public void setTenure(int tenure){
	    this.tenure=tenure;
	}
	public int getTenure(){
	    return tenure;
	}
	public void setInterestRate(float interestRate){
	    this.interestRate=interestRate;
	}
	public float getInterestRate(){
	    return interestRate;
	}
	
}

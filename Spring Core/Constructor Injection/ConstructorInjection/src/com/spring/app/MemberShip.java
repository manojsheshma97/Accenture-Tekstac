package com.spring.app;

public class MemberShip {
	private int membershipId;
	private String membershipType;
	private int visitsPerYear;
	private Customer customer;
	
	public MemberShip(Customer customer){
	    this.customer=customer;
	}
	public void setMembershipId(int membershipId){
	    this.membershipId=membershipId;
	}
	public int getMembershipId(){
	    return membershipId;
	}
	public void setMembershipType(String membershipType){
	    this.membershipType=membershipType;
	}
	public String getMembershipType(){
	    return membershipType;
	}
	public void setVisitsPerYear(int visitsPerYear){
	    this.visitsPerYear=visitsPerYear;
	}
	public int getVisitsPerYear(){
	    return visitsPerYear;
	}
	public void setCustomer(Customer customer){
	    this.customer=customer;
	}
	public Customer getCustomer(){
	    return customer;
	}
}	 	  	    	    	     	      	 	

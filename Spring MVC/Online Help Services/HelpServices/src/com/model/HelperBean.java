package com.model;

public class HelperBean {
	
	private String serviceType;
	private float serviceCostPerHour;
	private int noOfHours;
	
	public void setServiceType(String serviceType){
	    this.serviceType=serviceType;
	}
	public void setServiceCostPerHour(float serviceCostPerHour){
	    this.serviceCostPerHour=serviceCostPerHour;
	}
    public void setNoOfHours(int noOfHours){
        this.noOfHours=noOfHours;
    }
    public String getServiceType(){
        return this.serviceType;
    }
    public float getServiceCostPerHour(){
        return this.serviceCostPerHour;
    }
    public int getNoOfHours(){
        return this.noOfHours;
    }
}

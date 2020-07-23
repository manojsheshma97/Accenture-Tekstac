package com.spring.app;

import java.util.*;

public class OnlineShop {
	private Map<String,String>pObj;
	public Map<String,String> getPObj(){
	    return pObj;
	}
	public void setPObj(Map<String,String> pObj){
	    this.pObj=pObj;
	}
	public int calculateTotalPrice(int totalProductsPurchased, String productName){
	    String nm=productName.toUpperCase();
	    String p=pObj.get(nm);
	    int price=Integer.parseInt(p);
	    return totalProductsPurchased*price;
	}
}
	 	  	    	    	     	      	 	

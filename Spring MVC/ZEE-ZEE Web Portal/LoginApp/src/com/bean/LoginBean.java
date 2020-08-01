package com.bean;

public class LoginBean {
	private String userName;
	private String password;
	
	public void setUserName(String userName){
	    this.userName=userName;
	}
	public void setPassword(String password){
	    this.password=password;
	}
	public String getUserName(){
	    return userName;
	}
	public String getPassword(){
	    return password;
	}
}

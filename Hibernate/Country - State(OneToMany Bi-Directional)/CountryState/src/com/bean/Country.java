package com.bean;
import java.util.*;
import javax.persistence.*;

@Entity 
@Table(name="Country")
public class Country {
	@Id 
	private String countryName;
	private String currency;
	private String capital;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="country", cascade=CascadeType.ALL)
	
	private List<State> statelist;
	public void setCountryName(String countryName){
	    this.countryName=countryName;
	}
	public void setCurrency(String currency){
	    this.currency=currency;
	}
	public void setCapital(String capital){
	    this.capital=capital;
	}
	public void setStatelist(List<State> statelist){
	    this.statelist=statelist;
	}
	public String getCountryName(){
	    return countryName;
	}
	public String getCurrency(){
	    return currency;
	}
	public String getCapital(){
	    return capital;
	}
	public List<State> getStatelist(){
	    return statelist;
	}
	
}

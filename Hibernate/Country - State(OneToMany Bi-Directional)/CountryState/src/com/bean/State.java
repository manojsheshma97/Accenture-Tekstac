package com.bean;
import javax.persistence.*;

@Entity 
@Table(name="State")
public class State {
	@Id 
	private String stateName;
	private String language;
	private long population;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="countryName")
	
	private Country country;
	public void setStateName(String stateName){
	    this.stateName=stateName;
	}
	public void setLanguage(String language){
	    this.language=language;
	}
	public void setPopulation(long population){
	    this.population=population;
	}
	public void setCountry(Country country){
	    this.country=country;
	}
	public String getStateName(){
	    return stateName;
	}
	public String getLanguage(){
	    return language;
	}
	public long getPopulation(){
	    return population;
	}
	public Country getCountry(){
	    return country;
	}
}

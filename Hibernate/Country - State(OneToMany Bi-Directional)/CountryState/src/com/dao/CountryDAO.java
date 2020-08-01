package com.dao;
import com.bean.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.*;

public class CountryDAO {
	private Session session;
	public void setSession(Session session){
	    this.session=session;
	}
	public Session getSession(){
	    return session;
	}
	public void addCountry(Country country){
	    Transaction transaction=session.beginTransaction();
	    session.save(country);
	    transaction.commit();
	}
	public void addStatetoCountry(String countryName,State state){
	    Country updayer=(Country)session.get(Country.class,countryName);
	    state.setCountry(updayer);
	    updayer.getStatelist().add(state);
	    Transaction transaction=session.beginTransaction();
	    session.saveOrUpdate(updayer);
	    transaction.commit();
	}
	public List<State> stateWithMaxPopulation(String countryName){
	    List<State> tempe=new ArrayList<State>();
	    String hq1="from Country where countryName= :countryName";
	    Query query=session.createQuery(hq1);
	    query.setParameter("countryName",countryName);
	    
	    Country guo=(Country)query.uniqueResult();
	    long max=-1;
	    for(State haw:guo.getStatelist()){
	        if(haw.getPopulation()>=max){
	            max=haw.getPopulation();
	        }
	    }
	    for(State haw:guo.getStatelist()){
	        if(haw.getPopulation()==max){
	            tempe.add(haw);
	        }
	    }
	    return tempe;
	}
	public void removeCountry(String countryName){
	    Transaction transaction=session.beginTransaction();
	    Country deleto = (Country)session.get(Country.class, countryName);
	    session.delete(deleto);
	    transaction.commit();
	}
}

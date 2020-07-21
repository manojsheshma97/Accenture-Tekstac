package com.spring.app;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DebitCard {
	private int cardNo;
	private Date fromDate, expiryDate;
	private String cardHolderName;
	
	@Value("platinum")
	private String cardType;
	
	public void setCardNo(int a){
	    this.cardNo=a;
	}
	public void setFromDate(Date a){
	    this.fromDate=a;
	}
	public void setExpiryDate(Date a){
	    this.expiryDate=a;
	}
	public void setCardHolderName(String a){
	    this.cardHolderName=a;
	}
	public void setCardType(String a){
	    this.cardType=a;
	}
	public int getCardNo(){
	    return cardNo;
	}
	public Date getFromDate(){
	    return fromDate;
	}
	public Date getExpiryDate(){
	    return expiryDate;
	}
	public String getCardType(){
	    return cardType;
	}
	public String getCardHolderName(){
	    return cardHolderName;
	}

}

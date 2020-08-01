package com.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity 
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	private String custName;
	private String custAddress;
	
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cardNo")
    private BonusCard card;

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public void setCard(BonusCard card){
	    this.card=card;
	}
	public BonusCard getCard(){
	    return card;
	}
	

}

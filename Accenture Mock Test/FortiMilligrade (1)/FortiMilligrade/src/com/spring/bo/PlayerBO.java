package com.spring.bo;

import org.springframework.stereotype.Component;
import com.spring.model.Player;

//use appropriate annotation
@Component
public class PlayerBO {

	/* This method should calculate the entry fees amount and return the same to the PlayerService class */
	
	public double calculateEntryFees (Player obj, String category) 
	{
		double amount=0.0;
		// fill the code
		double fee=0;
		
		switch(category){
		case("MiniMarathon"):{fee=500.00;break;}
		case("HalfMarathon"):{fee=1000.00;break;}
		case("Marathon"):{fee=1500.00;break;}
		}
		
		int dis=0;
		
		String gen=obj.getGender();
		
		if(gen.equals("Female")) {
			dis=20;
		}
		else
			dis=0;
		
		amount= fee - (fee*dis)/100.00;
		return amount;
	}

}

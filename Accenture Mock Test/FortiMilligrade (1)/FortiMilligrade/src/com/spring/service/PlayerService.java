package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.PlayerBO;
import com.spring.config.ApplicationConfig;
import com.spring.model.Player;


// use appropriate annotation
@Component
public class PlayerService {
	
	// use appropriate annotation
	@Autowired
	private PlayerBO playerBOObj;

	public PlayerBO getPlayerBOObj() {
		return playerBOObj;
	}

	public void setPlayerBOObj(PlayerBO playerBOObj) {
		this.playerBOObj = playerBOObj;
	}

	/* This method has to assign the values of playerName, gender, age, phoneNumber and category to the Player object sObj 
	and invoke calculateEntryFees method in PlayerBO class by passing Player object sObj */
	public double calculateEntryFees (String playerName, String gender, int age, String phoneNumber, String category) 
	{
		double amount=0.0;
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Player sObj=(Player)ctx.getBean("player");
		// fill the code
		sObj.setPlayerName(playerName);
		sObj.setGender(gender);
		sObj.setAge(age);
		sObj.setPhoneNumber(phoneNumber);
		
		amount=playerBOObj.calculateEntryFees(sObj, category);
		
		
		return amount;
	}

}

package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.service.PlayerService;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// fill the code
		
		System.out.println("Enter Player Name:");
		String name=sc.nextLine();
		System.out.println("Enter Gender (Male/Female):");
		String gender=sc.nextLine();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Player 10 digit Mobile Number:");
		String ph=sc.nextLine();
		
		System.out.println("Enter Marathon category:");
		String cat=sc.nextLine();
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		PlayerService ps=(PlayerService)ctx.getBean("playerService");
		
		double amt=ps.calculateEntryFees(name, gender, age, ph, cat);
		System.out.println("Entry Fees to be paid is Rs:"+amt);

	}

}

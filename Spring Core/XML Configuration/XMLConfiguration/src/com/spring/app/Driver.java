package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Driver {
	
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	FixedDeposit fd=(FixedDeposit) c.getBean("FixedDeposit");
	System.out.println("Enter the account number:");
	int n=s.nextInt();
	fd.setAccountNumber(n);
	System.out.println("Enter the account holder name:");
	String name=s.nextLine();
	fd.setAccountHolderName(name);
	System.out.println("Enter the amount:");
	float amt=s.nextFloat();
	fd.setAmt(amt);
	System.out.println("Enter the tenure:");
	int t=s.nextInt();
	fd.setTenure(t);
	
	System.out.println("Account Number:"+fd.getAccountNumber());
	System.out.println("Account holder name:"+fd.getAccountHolderName());
	System.out.println("Amount:"+fd.getAmt());
	System.out.println("Tenure:"+fd.getTenure());
	System.out.println("Interest Rate:"+fd.getInterestRate());
	
}

}
	 	  	    	    	     	      	 	

package com.spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Driver {
public static void main(String[] args)
{
	  Scanner sc=new Scanner(System.in);
	  ApplicationContext cx=new AnnotationConfigApplicationContext(com.spring.app.ApplicationConfig.class);
	  Employee emp=(Employee)cx.getBean("employee");
	  emp.setEmpId(sc.nextInt());
	  sc.nextLine();
	  emp.setEmpName(sc.nextLine());
	  emp.getPassObj().setPassNum(sc.nextInt());
	  sc.nextLine();
	  emp.getPassObj().setDateOfIssue(sc.nextLine());
	  emp.getPassObj().setDateOfExpiry(sc.nextLine());
	  
	  System.out.println(emp.getEmpId());
	  System.out.println(emp.getEmpName());
	  System.out.println(emp.getPassObj().getPassNum());
	  System.out.println(emp.getPassObj().getDateOfIssue());
	  System.out.println(emp.getPassObj().getDateOfExpiry());
	  
}
}
package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Driver {
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	OnlineShop os=(OnlineShop) c.getBean("osobj");
	int a=sc.nextInt();
	sc.nextLine();
	String b=sc.nextLine();
	System.out.println(os.calculateTotalPrice(a,b));
	
}

}

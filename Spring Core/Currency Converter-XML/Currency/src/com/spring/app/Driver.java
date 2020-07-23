package com.spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Driver {
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	CurrencyConverter cc=(CurrencyConverter)ctx.getBean("ccObj");
	String a=sc.next();
	System.out.println(cc.getTotalCurrencyValue(a));
}

}

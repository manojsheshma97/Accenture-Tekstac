package com.spring.app;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	MemberShip ms=(MemberShip) ctx.getBean("msobj");
	ms.setMembershipId(sc.nextInt());
	sc.nextLine();
	ms.setMembershipType(sc.nextLine());
	ms.setVisitsPerYear(sc.nextInt());
	sc.nextLine();
	ms.getCustomer().setCustId(sc.nextInt());
	sc.nextLine();
	ms.getCustomer().setCustName(sc.nextLine());
	ms.getCustomer().setEmailId(sc.nextLine());
    ms.getCustomer().setContactNo(sc.nextLong());
    System.out.println(ms.getMembershipId());
    System.out.println(ms.getMembershipType());
    System.out.println(ms.getVisitsPerYear());
    System.out.println(ms.getCustomer().getCustId());
    System.out.println(ms.getCustomer().getCustName());
    System.out.println(ms.getCustomer().getEmailId());
    System.out.println(ms.getCustomer().getContactNo());
}

}

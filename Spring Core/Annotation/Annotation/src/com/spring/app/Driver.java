package com.spring.app;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.*;

public class Driver {
public static void main(String[] args) throws IOException
{
	Scanner x=new Scanner(System.in);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	DebitCard dt=(DebitCard)ctx.getBean("debitCard");
	dt.setCardNo(Integer.parseInt(br.readLine()));
	dt.setCardHolderName(br.readLine());
	
	try{
	    dt.setFromDate(sdf.parse(x.nextLine()));
	    dt.setExpiryDate(sdf.parse(x.next()));
	}
	catch(ParseException e){}
	
	System.out.println(dt.getCardNo());
	System.out.println(dt.getCardHolderName());
	System.out.println(sdf.format(dt.getFromDate()));
	System.out.println(sdf.format(dt.getExpiryDate()));
	System.out.println(dt.getCardType());
}
	
}

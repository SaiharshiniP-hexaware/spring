package com.hexa.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.service.CalculateInterest;

public class Output {
	private static ApplicationContext ctx;
	
	static {
		ctx=new ClassPathXmlApplicationContext("beans.xml");
	    
	}
public static void main(String args[]) {
	CalculateInterest cal=ctx.getBean("myser",CalculateInterest.class);
	double res=cal.calculateSimple(100, 10);
	System.out.println("simple interest is"+res);
	double res1=cal.calculateCompound(100, 10);
	System.out.println("compound interest is "+res1);
}
}

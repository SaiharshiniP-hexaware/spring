package com.hexa.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.hexa.service.Operations;

public class Output {
	private static ApplicationContext ctx;
	
	static {
		ctx=new ClassPathXmlApplicationContext("beans.xml");
	    
	}
public static void main(String args[]) {
	System.out.println("hello");
	Operations cal=ctx.getBean("myoperations",Operations.class);
	
	int result=cal.getSum();
	System.out.println(result);
}
}

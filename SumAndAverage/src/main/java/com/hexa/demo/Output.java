package com.hexa.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.service.Operations;

public class Output {
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext("beans.xml");

	}

	public static void main(String args[]) {
		Operations ope = ctx.getBean("myser", Operations.class);
		int res = ope.sumOfIntegers();
		System.out.println("sum is" + res);
		int ares = ope.avgOfIntegers();
		System.out.println("average is" + ares);
	}
}

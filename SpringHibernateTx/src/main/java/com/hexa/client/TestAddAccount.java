package com.hexa.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.entity.Account;
import com.hexa.service.Iser;

public class TestAddAccount {
	private static ApplicationContext ctx;

	static {
		ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);

	}

	public static void main(String[] args) {
		Iser ser = ctx.getBean("myser", Iser.class);
		Account acc1 = new Account(1003, "sam", 5000);
		Account acc2 = new Account(1004, "peter", 15000);
		List<Account> lst = new ArrayList<Account>();
		lst.add(acc1);
		lst.add(acc2);
		ser.addAccount(lst);
		System.out.println("transaction done");
	}
}

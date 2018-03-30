package com.hexa.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.dao.AccountDao;
import com.hexa.entity.Account;
import com.hexa.service.Iser;

public class TransferFund {
	private static ApplicationContext ctx;

	static {
		ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);

	}

	public static void main(String[] args) {
		Iser ser = ctx.getBean("myser", Iser.class);
		ser.transferFund(1001, 1002, 3000);
		System.out.println("transferred ");
		AccountDao dao = ctx.getBean("mydao", AccountDao.class);
		System.out.println(dao.getAccount(1001));
		System.out.println(dao.getAccount(1002));
	}
}

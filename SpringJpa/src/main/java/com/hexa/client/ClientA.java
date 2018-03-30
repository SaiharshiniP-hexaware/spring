package com.hexa.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.dao.IDao;
import com.hexa.entity.Student;

public class ClientA {
	private static ApplicationContext ctx;
	static {
		ctx = new AnnotationConfigApplicationContext(JPAConfig.class);
	}

	public static void main(String[] args) throws ParseException {
		IDao dao = ctx.getBean("mydao", IDao.class);
		System.out.println(dao.getStudent(1001));
		System.out.println("adding an student ");
		Student stu =  new Student();
		stu.setStuId(2525);
        stu.setStuName("kushi");
        stu.setDept("ece");
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date dt=sdf.parse("12/11/1995");
     stu.setDob(dt);
     int res=dao.addStudent(stu);
     System.out.println("row added"+res);
        
	}
}

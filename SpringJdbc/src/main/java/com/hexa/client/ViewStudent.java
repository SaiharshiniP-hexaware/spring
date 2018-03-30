package com.hexa.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.dao.IDao;
import com.hexa.entity.Student;

public class ViewStudent {
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");

	}

	public static void main(String[] args) {
	
	
		IDao dao = ctx.getBean("mydao", IDao.class);
		System.out.println("to view all students");
		List<Student> lst=dao.getStudents("ece");
        for(Student stu:lst) {
        	System.out.println(stu);
        }
	System.out.println("_____view by student____");
	System.out.println(dao.getStudent(1001));
	}
}

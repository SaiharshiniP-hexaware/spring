package com.hexa.client;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.dao.IDao;

public class ClientA {
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");

	}

	public static void main(String[] args) {
		System.out.println("inside main!!!");
		IDao dao = ctx.getBean("mydao", IDao.class);
		List<Map<String, Object>> lst = dao.getStudentsMap("ece");
		for (Map map : lst) {
			System.out.println(map.get("stu_id"));
			System.out.println(map.get("stu_name"));
			System.out.println(map.get("dept"));
			System.out.println(map.get("stu_dob"));
			System.out.println(map.get("stu_marks"));
			System.out.println("______________");

		}
		System.out.println("student data by student id by 1001");
		Map<String, Object> map = dao.getStudentAsMap(1001);
		System.out.println(map.get("stu_id"));
		System.out.println(map.get("stu_name"));
		System.out.println(map.get("dept"));
		System.out.println(map.get("stu_dob"));
		System.out.println(map.get("stu_marks"));
		System.out.println("______________");

	}

}

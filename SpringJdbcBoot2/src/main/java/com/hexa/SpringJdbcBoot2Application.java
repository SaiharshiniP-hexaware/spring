package com.hexa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexa.dao.IDao;
import com.hexa.entity.Student;

@SpringBootApplication
public class SpringJdbcBoot2Application implements CommandLineRunner{

	@Autowired
	private IDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcBoot2Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Student> lst = dao.getStudents("ece");
		lst.forEach(System.out::println);
		
	}
}

package com.hexa.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexa.dao.IDao;
import com.hexa.entity.Student;

@Controller // with this annotation only then this class is going to be controlled by
			// DispatcherServlet.
public class StudentController {
	@Autowired
	private IDao dao;

	@RequestMapping("/students")
	public String displayStudents(@RequestParam("dname") String dept, Model model) {
		model.addAttribute("title", "Student Details");
		List<Student> lst = dao.getStudents(dept);
		model.addAttribute("slist", lst);// title is the model attribute

		return "StudentView";
	}
}

package com.hexa.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.hexa.entity.Student;

public class FileDaoImpl implements StudentDao {
private String fname;
public void setFname(String fname) {
	this.fname=fname;
}
@Override
public List<Student> getStudents(){
	List<Student> lst=new ArrayList<Student>();
	String str=null;
	String[] arr=null;
	Student stu=null;
	
	try(BufferedReader br = new BufferedReader(new FileReader(fname))){
	while((str=br.readLine())!=null) {
		arr=str.split(",");
		stu=new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
		lst.add(stu);
	}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return lst;
}
}

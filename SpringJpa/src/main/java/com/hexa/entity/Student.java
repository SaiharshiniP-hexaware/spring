package com.hexa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // to show that this class is used for mapping
@Table(name = "student") // to map the class to this table
//@DynamicUpdate ---- update only specific rows.(jar was not added here).
public class Student {
	@Id // allows to define a column as a primary key.
	@Column(name = "stu_id")
	private int stuId;
	
	@Column(name = "stu_name", length = 45) // if the length not specified then
									// hibernate takes whole 255 characters,
	private String stuName;
	@Column(name = "dept", length = 20)
	private String dept;
	@Column(name = "stu_dob")
	private Date dob;
	@Column(name = "stu_marks")
	private int marks;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return stuId + " " + stuName + " " + marks + " " + dept + " " + dob;
	}

}

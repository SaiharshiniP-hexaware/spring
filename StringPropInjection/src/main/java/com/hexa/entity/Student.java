package com.hexa.entity;

public class Student {
private int sid;
private String sname;
private int marks;
public int getSid() {
	return sid;
}

public String getSname() {
	return sname;
}

public int getMarks() {
	return marks;
}

public Student(int sid, String sname, int marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return sid +" " + sname + " "+marks;
}

}

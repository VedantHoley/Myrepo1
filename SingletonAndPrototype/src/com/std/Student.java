package com.std;

public class Student {
	
	String name;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
//	public String toString() {
//		return "Student [name=" + name + ", rollno=" + rollno + "]";
//	}
//	
	Student()
	{
		System.out.println("Student Cons Calling");
	}
}

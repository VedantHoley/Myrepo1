package com.example.Basicproject.Service;

import java.util.List;


import com.example.Basicproject.Model.Student;


public interface Serviceinterface {
	
	public List<Student> getall();
	public void savedata(Student std);
	public void updatedata(Student std);
	public Student getelementbyid(int id);
	public void deletestudent(Student std);
	
	
}

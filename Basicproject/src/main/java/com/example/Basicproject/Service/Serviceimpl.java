package com.example.Basicproject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Basicproject.Model.Student;
@Service
public class Serviceimpl implements Serviceinterface {
	
	static List<Student>allstd = new ArrayList<Student>();
	
	static {
		allstd.add(new Student("vedant",3));
		allstd.add(new Student("Rasika",4));
		allstd.add(new Student("Renuka",5));
		allstd.add(new Student("Rupali",6));
	}
	@Override
	public List<Student> getall() {
		return allstd;
	}
	
	@Override
	public void savedata(Student std) {
		allstd.add(std);
	}

	@Override
	public void updatedata(Student std) {
		for(Student s:allstd) {
			if(s.getRollno()==std.getRollno()) {
				s.setName(std.getName());
			}
		}
	}

	public Student getelementbyid(int id) {
		Student st = null;
		for(Student s:allstd) {
			if(s.getRollno()==id) {
				return s;
		}	
		}
		throw new RuntimeException("Student not found");
	}
	@Override
	public void deletestudent(Student std) {
		allstd.remove(std);
	}

	
	
}

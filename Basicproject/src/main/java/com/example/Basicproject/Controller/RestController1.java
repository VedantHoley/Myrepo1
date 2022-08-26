package com.example.Basicproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Basicproject.Model.Student;
import com.example.Basicproject.Service.Serviceinterface;

@RestController
@RequestMapping("/api")
public class RestController1 {
	
	@Autowired
	Serviceinterface service;
	
	@GetMapping("/getallstd")
	public List<Student>allstudent(){
		return service.getall();
		
	}
	
	@PostMapping("/std")
	public Student savestudent(@RequestBody Student std) {
		service.savedata(std);
		return std;
	}
	
	@PutMapping("/std")
	public Student Updatestudent(@RequestBody Student std) {
		service.updatedata(std);
		return std;
	}
	@GetMapping("/getstd/{id}")
	public Student findbyid(@PathVariable int id) {
		Student sd = service.getelementbyid(id);
		return sd;
	}
	
	@DeleteMapping("/deletestd/{rollno}")
	public String deletestd(@PathVariable int rollno) {
		Student std = service.getelementbyid(rollno);
		if(std==null) {
			throw new RuntimeException("Student Not found");
		}
		service.deletestudent(std);
		return "Student deleted on id - " + rollno;
	}
}


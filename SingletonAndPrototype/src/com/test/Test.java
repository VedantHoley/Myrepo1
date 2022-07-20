package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.std.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Student std = (Student) ctx.getBean("std");
		Student std1 = (Student) ctx.getBean("std");
		System.out.println(std==std1);
		
	System.out.println(std);
	System.out.println(std1);
		
	}
}

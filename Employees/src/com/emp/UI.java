package com.emp;

import java.util.Scanner;

public class UI {
static Scanner sc = new Scanner(System.in);
static BuisnessDao buisness = new BuisnessDao();

	public static void main(String[] args) {
		
		System.out.println("1) for add emp \n 2) for delete emp \n 3) for update emp \n 4) for view emp \n 5) Exit");
		int no  = sc.nextInt();
		
		while(true) {
			switch(no) {
			case 1:
				addemp();
				break;
			case 2:
				deleteemp();
				break;
			case 3:
				updateemp();
				break;
			case 4:
			viewemp();
			break;
			case 5:
				exit();
				break;
			}
		}
	}
	
	private static void exit() {
		
	}

	private static void viewemp() {
		
	}
	private static void updateemp() {
		
	}
	private static void deleteemp() {
		
	}
	private static void addemp() {
		
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter country");
		String country = sc.next();
		System.out.println("Employee regestration done with id : " + buisness.add(name,city,country));

	}
}

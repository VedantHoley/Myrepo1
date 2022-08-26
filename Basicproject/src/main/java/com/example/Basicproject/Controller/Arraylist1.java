package com.example.Basicproject.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist1 {	
static ArrayList<Integer>A1 = new ArrayList<Integer>();
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Queries");
		int que = sc.nextInt();
		System.out.println("Enter String");
		String st = sc.next();
		System.out.println("Before if");
		if(st.length()<=100) {
			System.out.println("Inside if");
			for(int i=0;i<st.length();i++) {
				System.out.println("Inside ");
				switch (st.charAt(i)) {
				case 'a':
					add((char) (st.charAt(i)+1));
					System.out.println("Entered in A");
					break;
				case 'b':
					sortmethod(A1);
					break;
				case 'c':
					reversemethod(A1);
					break;
				case 'd':{
					sizemethod(A1);
					break;
				}
				case 'e':
					spacevalues(A1);
					break;
				
				case 'f':
					descendingmethod(A1);
					break;
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + st.charAt(i));
				}
			}
		}
		System.out.println("After if");

	}
	private static void descendingmethod(ArrayList<Integer> a12) {
		sortmethod(a12);
		reversemethod(a12);
	}
	private static void sizemethod(ArrayList<Integer> a12) {
		a12.add(a12.size());
    }
	private static void reversemethod(ArrayList<Integer> a12) {
		Collections.reverse(a12);
    }
	private static void add(char i) {
		A1.add(i-'0');
	}
	private static void spacevalues(ArrayList<Integer> a12) {
	for(int i:a12) {
		System.out.println(i);
	}
    }
	private static void sortmethod(ArrayList<Integer> a12) {
	Collections.sort(a12);
    }
}

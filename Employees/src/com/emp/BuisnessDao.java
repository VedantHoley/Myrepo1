package com.emp;

import java.util.ArrayList;
import java.util.List;

public class BuisnessDao {
	
	List<E1>listemp = new ArrayList<E1>(); // emp list
	Address address = new Address();
	E1 emp = new E1();
	static int id = 0;
	
	public int add(String name, String city, String country) {
		address.setCity(city);
		address.setCountry(country);
		emp.setName(name);
		emp.setId(id++);
		emp.setAddr(address);
		listemp.add(emp);
		return emp.getId();
		
	}
	
}

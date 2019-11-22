package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, "manasa", 50000);
		Employee e2 = new Employee(1, "navya", 20000);
		Employee e3 = new Employee(3, "srujana", 10000);
		Employee e4 = new Employee(4, "swetha", 60000);
		Employee e5 = new Employee(5, "uma", 90000);
		Employee e6 = new Employee(8, "usha", 40000);
		Employee e7 = new Employee(7, "sree", 30000);
		Employee e8 = new Employee(10, "vamsi", 510000);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e1);
		al1.add(e2);
		
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e3);
		al2.add(e4);
		

		ArrayList<Employee> al3 = new ArrayList<>();
		al3.add(e5);
		al3.add(e6);
		al3.add(e7);
		al3.add(e8);
		
		HashMap<String,ArrayList<Employee>> h = new HashMap<>();
		h.put("john", al1);
		h.put("james", al2);
		h.put("adam", al3);
		
		
		ArrayList<Employee> v=h.get("james");
		Iterator<Employee> i = v.iterator();
		while(i.hasNext()) {
			Employee e =i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		
		
		
		
		
		
		
	}

}

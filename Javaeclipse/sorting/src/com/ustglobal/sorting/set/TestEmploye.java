package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmploye {
	public static void main(String[] args) {
		TreeSet<Employee> h = new TreeSet<>();
		Employee e1 = new Employee("manasa", 12, 25000);
		Employee e2 = new Employee("cream", 8, 35000);
		Employee e3 = new Employee("srujana", 9, 15000);
		Employee e4 = new Employee("swetha", 15, 40000);
		Employee e5 = new Employee("swetha", 15, 40000);
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		System.out.println("*****using iterator");
		Iterator<Employee> i = h.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.name);
			System.out.println(e.id);
			System.out.println(e.salary);
		}
		
		
	}

}


	



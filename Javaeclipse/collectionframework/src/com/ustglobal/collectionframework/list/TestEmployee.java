package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	ArrayList<Employee> a = new ArrayList<Employee>();
	Employee e1 = new Employee(1, "manasa", 10000);
	Employee e2 = new Employee(2, "navya", 20000);
	Employee e3 = new Employee(3, "srujana", 30000);
	a.add(e1);
	a.add(e2);
	a.add(e3);
	
	for (int i = 0; i < a.size(); i++) {
		Employee e = a.get(i);
		System.out.println("id is "+e.id);
		System.out.println("name is "+e.name);
		System.out.println("salary is "+e.salary);
		
	}
	System.out.println("for each");
	for(Employee e:a) {
		System.out.println(e);
	}
	
	System.out.println("using iterator");
	Iterator i = a.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
	}
	System.out.println("using listiterator");
	ListIterator li = a.listIterator();
	System.out.println("forward");
	while(li.hasNext()) {
		Object o = li.next();
		System.out.println(o);
	}
	System.out.println("backward");
	while(li.hasPrevious()) {
		Object o = li.previous();
				System.out.println(o);
	}
	
}
}



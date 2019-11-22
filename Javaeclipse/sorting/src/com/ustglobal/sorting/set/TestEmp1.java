package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmp1 {
	public static void main(String[] args) {
		Comparator<Employee1> comp = (e1,e2)-> {
			if(e1.height>e2.height) {
				return 1;
			}else if(e1.height<e2.height) {
				return -1;
			}else {
				return 0;
			}
		};
		
		TreeSet<Employee1> t = new TreeSet<>(comp);
		Employee1 e1 = new Employee1(10, "srujana", 5.6);
		Employee1 e2 = new Employee1(4, "navya", 5.8);
		Employee1 e3 = new Employee1(10, "manasa", 6.0);
		Employee1 e4 = new Employee1(10, "swetha", 5.2);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		System.out.println("using iterator");
		Iterator<Employee1> i = t.iterator();
		while(i.hasNext()) {
			Employee1 e= i.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.height);
		}
		
		
		
	}

}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<>();
		Employee e1 = new Employee(11,"manasa");
		Employee e2 = new Employee(1,"navya");
		Employee e3 = new Employee(2,"ammu");
		a.add(e1);
		a.add(e2);
		a.add(e3);
		Comparator<Employee> c = (e5,e6)->{
			return e5.name.compareTo(e6.name);
		};
		
		List<Employee> l =a.stream().sorted(c).collect(Collectors.toList());
		for(Employee e :l) {
			System.out.println(e.id);
			System.out.println(e.name);
		}
		
	}
}

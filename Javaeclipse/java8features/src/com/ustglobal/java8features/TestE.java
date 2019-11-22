package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		Supplier<Student> s = ()->{
			Student s1 = new Student(1,"manas",87.9);
			return s1;
		};
		Student s2 = s.get();
		System.out.println(s2.id);
		System.out.println(s2.name);
		
	System.out.println("++++++++++++++++");
	Supplier<Integer> a =()->20;
	int val = a.get();
	System.out.println(val);
	
	}

}

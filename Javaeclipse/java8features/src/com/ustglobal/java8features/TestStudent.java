package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		
		
		ArrayList<Student> a = new ArrayList<>();
		Student s1 = new Student(1, "manasa", 29.0);
		Student s2 = new Student(11, "navya", 88);
		Student s3 = new Student(10, "deepika", 78.0);
		Student s4 = new Student(3, "cream", 30.0);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		Helper h = new Helper();
//		h.display(a);
		h.failed(a);
		System.out.println("===================");
		h.passed(a);
		System.out.println("=================");
		h.topper(a);
		
		
		
		
		
	}

}

package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "manasa", 82);
		Student s2 = new Student(2, "navya", 83.4);
		Student s3 = new Student(3, "srujana", 84.6);
		Student s4 = new Student(4, "swetha", 89.7);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			
		}
		System.out.println("for each");
		for(Student s:al) {
			System.out.println(s);
		}
		
	}
}

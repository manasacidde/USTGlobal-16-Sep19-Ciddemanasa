package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		Student s1= new Student(11, "manasa", 82.4);
		Student s2= new Student(8, "navya", 78.8);
		Student s3= new Student(9, "srujana", 98.7);
		Student s4= new Student(1, "swetha", 78.9);
		Student s5= new Student(5, "uma", 76.9);
		Student s6= new Student(6, "usha", 89.9);
		Student s7= new Student(7, "malathi", 67.9);
		Student s8= new Student(18, "sree", 60.9);
		Student s9= new Student(13, "vamsi", 61.9);
		
		ArrayList<Student> al1= new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		
		ArrayList<Student> al2= new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		ArrayList<Student> al3= new ArrayList<Student>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String,ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third",al3);
	
		
		ArrayList<Student> first = hm.get("first");
		Iterator<Student> i = first.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
		
		
		
		
		
		
		
		
		
	}

}

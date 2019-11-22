package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		Student s1=new Student(11, "Manasa", 90.2);
		Student s2=new Student(2, "cream", 81.2);
		Student s3=new Student(10, "srujana", 88.2);
		Student s4=new Student(1, "navya", 89.2);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		displayStudents(a);
		Collections.sort(a);
		displayStudents(a);
		
	
		}
	static void displayStudents(ArrayList<Student> al) {
		Iterator<Student> i = al.iterator();
		while(i.hasNext())
		{
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
		
	}
	
	

}

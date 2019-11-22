package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void display(ArrayList<Student> al) {
		for(Student s: al) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			System.out.println("==============================");
		}
	}
	void failed(ArrayList<Student> al) {
		List<Student> l =al.stream().filter(i->i.percentage<40).collect(Collectors.toList());
		for(Student s: l) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
	}
	void passed(ArrayList<Student> al) {
		List<Student> l =al.stream().filter(i->i.percentage>40).collect(Collectors.toList());
		for(Student s: l) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			
		}
	
	}
		
	void topper(ArrayList<Student> al) {
		Comparator<Student> comp = (s1,s2)->{
			if(s1.percentage>s2.percentage) {
				return 1;
			}else if(s1.percentage<s2.percentage) {
				return -1;
			}else {
				return 0;
			}
		
		};
		Student s = al.stream().max(comp).get();
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.percentage);
	}
}

package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		Consumer<Student> c = (s)->{
			System.out.println(s.id);
			System.out.println(s.name);
			
		};
		Student s = new Student(1, "manasa", 80.9);
		c.accept(s);
		
		
	}

}

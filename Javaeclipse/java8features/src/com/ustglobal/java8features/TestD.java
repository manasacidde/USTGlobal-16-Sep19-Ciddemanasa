package com.ustglobal.java8features;

import java.util.function.Function;

public class TestD {
	public static void main(String[] args) {
		Function<Integer,Student> f = id->{
			Student s = new Student(2,"manasa",89.6);
			s.id=id;
			return s;
			
		};
		Student s1 = f.apply(10);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.percentage);
	}

}

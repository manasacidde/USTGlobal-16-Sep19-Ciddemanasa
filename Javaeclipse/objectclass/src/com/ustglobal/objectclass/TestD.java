package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(1, "manasa", 80);
		int h = s.hashCode();
		System.out.println(h);
		System.out.println(s);
	}

}

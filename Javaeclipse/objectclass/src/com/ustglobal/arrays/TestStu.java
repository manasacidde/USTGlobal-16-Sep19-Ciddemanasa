package com.ustglobal.arrays;

public class TestStu {
	public static void main(String[] args) {
		Student s = new Student(1, "manasa", 82.4);
		Student s1 = new Student(2, "navya", 85);
		Student s2 = new Student(3, "srujana", 87);
		
		Student[] students= new Student[3];
		students[0] = s;
		students[1] = s1;
		students[2] = s2;
		for(Student S : students) {
			System.out.println(S);
		}
		receive(students);
	}
	
	static void receive(Student[] stu) {
		for(Student s: stu) {
			System.out.println(s);
		}
	}

}

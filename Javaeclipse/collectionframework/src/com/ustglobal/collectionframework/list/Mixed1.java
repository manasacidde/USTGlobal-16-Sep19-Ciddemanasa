package com.ustglobal.collectionframework.list;

public class Mixed1 {
	public static void main(String[] args) {
		Object[] obj = new Object[5];
		Student s1 =new Student(1, "MANASA", 82);
		Student s2 =new Student(2, "NAVYA", 82.5);
		Student s3 =new Student(3, "CREAM", 83);
		Student s4 =new Student(4, "OREO", 85);
		Student s5 =new Student(5, "ABC", 86);
		obj[0]=s1;
		obj[1]=s2;
		obj[2]=s3;
		obj[3]=s4;
		obj[4]=s5;
		for(int i =0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		for(Object o:obj) {
			System.out.println(o);
		}
		
		
	}

}

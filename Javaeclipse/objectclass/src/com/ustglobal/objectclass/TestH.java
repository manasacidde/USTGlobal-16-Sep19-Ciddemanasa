package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("manasa", 1);
		System.out.println(p.id);
		System.out.println(p.name);
		Object o = p.clone();
		Person p1= (Person)o;
		p1.id=2;
		System.out.println(p1.id);
		System.out.println(p.id);
		System.out.println(p1.name);
		
				}

}

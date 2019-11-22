package com.ustglobal.objectclass;

public class Person implements Cloneable {
	String name;
	int id;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

}

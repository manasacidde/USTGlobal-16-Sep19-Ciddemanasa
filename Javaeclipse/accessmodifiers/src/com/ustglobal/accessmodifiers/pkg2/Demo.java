package com.ustglobal.accessmodifiers.pkg2;

public class Demo {
	private int a = 10;
	long b = 700;
	protected double c = 78.98;
	public String name = "Anu";
	
	private void add() {
		System.out.println("demo add method");
	}
	void sub() {
		System.out.println("demo sub method");
	}
	protected void mul() {
		System.out.println("demo mul method");
	}
	public void div() {
		System.out.println("demo div method");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.a);
		d.add();
	}

}

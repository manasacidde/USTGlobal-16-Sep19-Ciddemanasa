package com.ustglobal.accessmodifiers.pkg2;

public class Run {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.b);
		d.sub();
		System.out.println(d.c);
		d.mul();
		System.out.println(d.name);
		d.div();
	}
}

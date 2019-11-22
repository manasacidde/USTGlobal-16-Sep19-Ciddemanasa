package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.b);
//		d.sub();
		Sample s = new Sample();
		System.out.println(s.c);
		s.mul();
		System.out.println(d.name);
		d.div();
	}
	

}

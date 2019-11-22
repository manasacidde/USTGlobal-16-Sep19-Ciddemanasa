package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Emp> p = i->i.id%3==0;
		Emp e = new Emp(30, "MANASA");
		boolean b =p.test(e);
		System.out.println(b);
		
	}
}

package com.ustglobal.lambdaexpressions;

public class TestAdd implements AddInterface{
	public static void main(String[] args) {
		TestAdd t1 = new TestAdd();
		System.out.println(t1.add(10, 20));
		
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}

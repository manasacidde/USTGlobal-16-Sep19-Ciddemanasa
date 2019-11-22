package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Function<Integer,Integer> f = i->i*i;
		
		int val = f.apply(4);
		System.out.println(val);
		
		
	}

}

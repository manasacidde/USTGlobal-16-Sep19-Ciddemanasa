package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("shreya");
		
		Object o =al.get(0);
		String s =(String)o;
		String s1=s.toUpperCase();
		System.out.println(s1);
		
	}

}

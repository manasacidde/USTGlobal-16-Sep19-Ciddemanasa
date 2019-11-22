package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add("manasa");
	al.add(true);
	
	Object obj = al.get(2);
	System.out.println(obj);
	for(int i =0;i<3;i++) {
		Object obj1 = al.get(i);
		System.out.println(obj1);
		
	}
	
			
	}

}

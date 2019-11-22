package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("manasa");
		al.add(true);
		
		System.out.println("using iterator");
		Iterator it = al.iterator();
		while(it.hasNext()) {
		Object o1=it.next();
		System.out.println(o1);
		}
	
		System.out.println("using for loop");
		for(int i=0;i<al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		
	}

}

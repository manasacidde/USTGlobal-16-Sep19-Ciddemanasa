package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("manasa");
		v.add(true);
		
		System.out.println("for loop");
		
		for (int i = 0; i < v.size(); i++) {
			Object o = v.get(i);
			System.out.println(o);
			
		}
		System.out.println("using for each");
		for(Object o1:v) {
			System.out.println(o1);
		}
		System.out.println("using iterator");
		Iterator i =v.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
		System.out.println("using listiterator");
		ListIterator l=v.listIterator();
		System.out.println("forward===========");
		while(l.hasNext()) {
			Object o = l.next();
			System.out.println(o);
		}
		System.out.println("backward============");
		while(l.hasPrevious()) {
			Object o =l.previous();
					System.out.println(o);
		}
	}

}


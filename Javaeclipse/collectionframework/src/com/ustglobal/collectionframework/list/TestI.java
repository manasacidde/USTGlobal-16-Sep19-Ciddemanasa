package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestI {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(10);
		s.add("manasa");
		s.add(true);
		
		System.out.println("for loop");
		
		for (int i = 0; i < s.size(); i++) {
			Object o = s.get(i);
			System.out.println(o);
			
		}
		System.out.println("using for each");
		for(Object o1:s) {
			System.out.println(o1);
		}
		System.out.println("using iterator");
		Iterator i =s.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
		System.out.println("using listiterator");
		ListIterator l=s.listIterator();
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


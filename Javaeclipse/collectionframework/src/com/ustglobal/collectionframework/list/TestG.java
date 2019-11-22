package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(10);
		li.add("manasa");
		li.add(true);
		System.out.println("using for loop");
		for (int i = 0; i < li.size(); i++) {
			Object o = li.get(i);
			System.out.println(o);
			
		}
		System.out.println("using for each");
		for(Object o1:li) {
			System.out.println(o1);
		}
		System.out.println("using iterator");
		Iterator i =li.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
		System.out.println("using listiterator");
		ListIterator l=li.listIterator();
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

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("manasa");
		ts.add("cream");
		ts.add("srujana");
		ts.add("navya");
		ts.add("swetha");
		
		
		System.out.println("***using for each");
		for(Object o : ts) {
			System.out.println(o);
		}
		System.out.println("****using iterator");
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}

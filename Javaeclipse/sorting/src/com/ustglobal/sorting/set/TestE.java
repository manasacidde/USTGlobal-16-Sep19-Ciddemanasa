package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(12);
		ts.add(10);
		ts.add(34);
//		ts.add("deepika");  //classcast exception
//		ts.add(null); ///nullpointer exception
		
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

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet  ls = new LinkedHashSet();
		ls.add(23);
		ls.add("manasa");
		ls.add(24.5);
		ls.add(23);
		ls.add(null);
		ls.add(null);
		
		System.out.println("***using for each");
		for(Object o : ls) {
			System.out.println(o);
		}
		System.out.println("****using iterator");
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
				
	}

}

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(12.3);
		ls.add(23.4);
		ls.add(15.8);
		System.out.println("****using for each");
		for(Double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("******using iterator");
		Iterator<Double> i = ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}

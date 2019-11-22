package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("nnn");
		hs.add("mmm");
		hs.add("aaaa");
		hs.add("kkk"); 
		
		System.out.println("*******using for each");
		for (String s :hs) {
			System.out.println(s);
		}
		
		System.out.println("******using iterator");
		Iterator i = hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}

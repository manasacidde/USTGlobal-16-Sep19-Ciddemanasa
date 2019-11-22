package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>  lh = new LinkedHashMap<String,Integer>();
		lh.put("bangalore", 560068);
		lh.put("haryana", 134203);
		lh.put("patna", 880000);
		System.out.println(lh);
		
	Set<String> s = lh.keySet();
	System.out.println("*************using for each");
	for(String s1:s) {
		System.out.println(s1);
	}
	
	Collection<Integer> c = lh.values();
	for(Integer val:c) {
	System.out.println(val);
	}
	
	
		
	}

}

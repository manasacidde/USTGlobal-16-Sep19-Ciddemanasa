package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String,Integer>  lh = new TreeMap<String,Integer>();
		lh.put("patna", 880000);
		lh.put("bangalore", 560068);
		lh.put("haryana", 134203);
		lh.put("manas", null);
		
		System.out.println(lh);
		for(Map.Entry<String, Integer> m :lh.entrySet()) {
			String s = m.getKey();
			Integer i = m.getValue();
			System.out.println("key is "+s);
			System.out.println("value is "+i);
		}
	}

}

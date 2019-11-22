package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("manas", 123);
		hm.put("sruj", 456);
		hm.put("navya", 678);
		
		HashMap hm1 = new HashMap();
		hm1.put("sree", 944);
		hm1.put("vishnu", 155);
		hm1.put("vamsi", 2175);
		
		boolean val=hm.containsKey("manas");
		System.out.println(val);
		
		System.out.println("==============================================");
		
		boolean val1=hm.containsValue(123);
		System.out.println(val1);
		
		hm.putAll(hm1);
		System.out.println("after putall "+hm);
		
		System.out.println(hm.size());
		boolean val2=hm.isEmpty();
		System.out.println(val2);
		hm.clear();
		System.out.println(hm);
		
		
		

		
		
		
	}

}

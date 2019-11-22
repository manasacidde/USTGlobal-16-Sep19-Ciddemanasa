package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("manas", 123);
		hm.put("sruj", 456);
		hm.put("navya", 678);
		
		
		System.out.println("data "+hm);
		hm.put("navya",799);
		System.out.println("after modify "+hm);
		
		hm.put("uma", 123);
		System.out.println("after uma"+hm);
		
		hm.put(null, 890);
		System.out.println("after null "+hm);
		
		hm.put(null, 988);
		System.out.println("after duplicating null "+hm);
		
		Object num= hm.get("manas");
		System.out.println(num);
		
		Object num1= hm.get("manasa");
		System.out.println(num1);
		
		Object val=hm.remove("sruj");
		System.out.println(val);
		System.out.println(hm);
	}

}

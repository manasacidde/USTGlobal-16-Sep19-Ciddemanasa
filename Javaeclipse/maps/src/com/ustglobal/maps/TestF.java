package com.ustglobal.maps;

import java.util.Hashtable;

public class TestF {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(101, "vija");
		ht.put(500, "manasa");
		ht.put(102, "vamsi");
		ht.put(101, "vijay");
		ht.put(103, "nikil");
		ht.put(104, "gagan");
//		ht.put(null, "vijay"); //null pointer
//		ht.put(101, null);     //null pointer
		
		System.out.println("data "+ht);
		
		
	}

}

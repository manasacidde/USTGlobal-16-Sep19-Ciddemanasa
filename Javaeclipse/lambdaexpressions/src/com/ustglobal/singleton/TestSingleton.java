package com.ustglobal.singleton;

public class TestSingleton {
	public static void main(String[] args) {
	
		MySingleton ms = MySingleton.getDbConnection();
		ms.s="hello";
		System.out.println(ms.s);
		System.out.println(ms.hashCode());
		
		MySingleton ms1 = MySingleton.getDbConnection();
		ms1.s="hi";
		System.out.println(ms1.s);
		System.out.println(ms.s);
		System.out.println(ms1.hashCode());
		
		
		
		
	}

}

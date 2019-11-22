package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "manasa";
		String s2 = "navya";
		
		String s3= new String("manasa");
		String s4= new String("manasa");
		String s5="manasa";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("MANASA");
		System.out.println(b);
		
		StringBuffer sb1 = new StringBuffer("kavya");
		sb1.append("xyz");
		System.out.println(sb1);
	
	
	}

}

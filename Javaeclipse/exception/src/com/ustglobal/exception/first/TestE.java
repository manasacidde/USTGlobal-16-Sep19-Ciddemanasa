package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");
		
		String s ="hello";
		int[] a = {10,20,30};
		int b= 10;
		try {
			System.out.println(s.toUpperCase());
			System.out.println(a[1]);
			System.out.println(b/0);
		}
//		catch(NullPointerException n) {
//			System.out.println("donot play with null");
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("number divide by zero");
//		}
//		catch(ArrayIndexOutOfBoundsException aie) {
//			System.out.println("invalid index");
//		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		System.out.println("main ended");
	}

}

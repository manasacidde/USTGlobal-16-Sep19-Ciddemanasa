package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		 nums[4] = 50;
		 for(int i=0;i<nums.length;i++)
		 {
			 System.out.println(nums[i]);
		 }
		 char[] ch = {'a','b','c'};
		 for(int i=0;i<ch.length;i++)
		 {
			 System.out.println(ch[i]);
		 }
		 for(char c:ch) {
			 System.out.println(c);
		 }
		 
		 byte[] b = {1,2,3};
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]);
		 }
		 for(int a:b) {
			 System.out.println(a);
		 }
		 
		 double[] d = {10.1,10.2,10.3};
		 for(int i =0;i<d.length;i++) {
			 System.out.println(d[i]);
		 }
		 for(double a:d) {
			 System.out.println(a);
		 }
		 
		 boolean[] b1 = {true,true,false,true};
		 for(int i=0;i<b1.length;i++) {
			 System.out.println(b1[i]);
		 }
		 for(boolean a:b1) {
			 System.out.println(a);
		 }
		 String[] names= {"manasa","navya"};
		 for(int i=0;i<names.length;i++) {
			 System.out.println(names[i]);
		 }
		 for(String s:names) {
			 System.out.println(s);
		 }
	}

}

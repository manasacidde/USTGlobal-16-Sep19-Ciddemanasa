package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
		String[] names= {"manasa","navya"};
		receive(names);
		String[] d = getString();
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
	
	static void receive(String[] names)
	{
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	static String[] getString() {
		String[] c = {"abc","cvb"};
		return c;
	}

}

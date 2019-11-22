package com.ustglobal.collectionframework.list;

public class Mixed {
	public static void main(String[] args) {
		Object[] mixedArray = new Object[4];
		mixedArray[0]=10;
		mixedArray[1]="Jack";
		mixedArray[2]=true;
		System.out.println("using for loop");
		for(int i=0;i<mixedArray.length;i++) {
			System.out.println(mixedArray[i]);
		}
		System.out.println("for each");
		for(Object o:mixedArray) {
			System.out.println(o);
		}
	}

}

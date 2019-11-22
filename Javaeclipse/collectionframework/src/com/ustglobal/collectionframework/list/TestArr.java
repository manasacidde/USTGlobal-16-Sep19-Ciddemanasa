package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestArr {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		a.add("mmmm");
		a.add("dddd");
		a.add("ccc");
		a.add("aaa");
		System.out.println("before sort "+a);
		Collections.sort(a);
		System.out.println("after sort" +a);
		
	}

}

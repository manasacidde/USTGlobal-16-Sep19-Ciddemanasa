package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("manasa");
		al.add(true);

		for(Object o : al)
		{
			System.out.println(o);
		}
	}
}

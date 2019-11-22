package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(40.5);
		al.add(23.5);
		al.add(41.2);
		al.add(89.5);
		al.add(null);
		al.add(null);
		al.add(34.5);
		System.out.println(al);
		al.add(2,30.5);
		System.out.println("after add in 2 index " +al);
		al.remove(0);
		System.out.println("aftr remove in 0 index"+al);
		al.remove(null);
		System.out.println("after remove null "+al);
		al.remove(10.7);
		System.out.println(al);
		Double val = al.get(4);
		System.out.println(val);
		al.set(1, 10.5);
		System.out.println(al);
////		al.clear();
//		System.out.println(al);
		al.contains(54.6);
		
		List<Double> al1= new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		al.addAll(al1);
		System.out.println("after add all" +al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("contains all of "+contain);
		System.out.println("before remove "+al);
		
		boolean res = al.removeAll(al1);
		System.out.println("remove all of "+res);
		System.out.println("after remove "+al);
		
	}

}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(45);
		List<Integer> l =al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
}
}

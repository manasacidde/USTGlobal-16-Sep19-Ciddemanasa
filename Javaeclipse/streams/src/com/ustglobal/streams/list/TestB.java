package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(45);
		List<Integer> l =al.stream().filter(i->i%3==0).collect(Collectors.toList());
		for(Integer i:l) {
			System.out.println(i);
		}
	}

}

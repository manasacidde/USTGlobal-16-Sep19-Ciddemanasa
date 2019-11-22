package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLap {
	public static void main(String[] args) {
		LinkedList<Laptop> li = new LinkedList<>();
		Laptop lp1 = new Laptop(25000, 4,"Hp");
		Laptop lp2 = new Laptop(35000, 6,"Dell");
		Laptop lp3 = new Laptop(100000, 12,"Mac");
		Laptop lp4 = new Laptop(50000, 8,"Asus");
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		
		
		display(li);
		Collections.sort(li);
		display(li);
		}
	
	
	static void display(LinkedList<Laptop> li) {
		Iterator<Laptop> it = li.iterator();
		while(it.hasNext())
		{
			Laptop l = it.next();
			System.out.println(l.name);
			System.out.println(l.ram);
			System.out.println(l.price);
		}
		
	}

}

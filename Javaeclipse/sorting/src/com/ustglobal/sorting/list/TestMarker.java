package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		ArrayList<Marker> a = new ArrayList<>();
		Marker m1 = new Marker(10, "blue");
		Marker m2 = new Marker(100, "red");
		Marker m3 = new Marker(50, "green");
		Marker m4 = new Marker(80, "black");
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		display(a);
		
		MarkerSortPrice sb = new MarkerSortPrice();
		SortColor sc = new SortColor();
//		Collections.sort(a, sb);
		Collections.sort(a, sc);
		display(a);
		
		
		
	}
	static void display(ArrayList<Marker> al) {
		Iterator<Marker> i = al.iterator();
		while(i.hasNext()) {
			Marker m = i.next();
			System.out.println(m.price);
			
			System.out.println(m.color);
		}
				
	}

}

package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortColor implements Comparator<Marker> {
	@Override
	public int compare(Marker o1, Marker o2) {
		String i = o1.color;
		String j = o2.color;
		return i.compareTo(j);
	}

}

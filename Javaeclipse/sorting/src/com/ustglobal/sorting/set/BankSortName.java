package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortName implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		String i=o1.name;
		String j= o2.name;
		return i.compareTo(j);
	}

}

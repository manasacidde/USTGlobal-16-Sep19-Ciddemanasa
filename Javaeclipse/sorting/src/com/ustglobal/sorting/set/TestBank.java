package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
	public static void main(String[] args) { 
		BankSortName bs = new BankSortName();
		BankSortPin bp = new BankSortPin();
		BankSortMicr bm = new BankSortMicr();
		TreeSet<Bank> ts = new TreeSet<>(bm);
		Bank b1 =new Bank("HDFC", 560068,6768689);
		Bank b2 =new Bank("SBI", 560071,9898989);
		Bank b3 =new Bank("CITI", 560068,7656767);
		Bank b4 =new Bank("CANARA", 560068,123456);
		Bank b5 =new Bank("CANARA", 560068,123456);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("*******using iterator");
		Iterator<Bank> i = ts.iterator();
		while(i.hasNext()) {
			Bank b = i.next();
			System.out.println(b.name);
			System.out.println(b.pincode);
			System.out.println(b.micr);
		}
		
		
		
	}
}

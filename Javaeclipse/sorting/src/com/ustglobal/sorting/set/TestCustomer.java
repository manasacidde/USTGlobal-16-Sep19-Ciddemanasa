package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerSortId cs = new CustomerSortId();
		TreeSet<Customer> t = new TreeSet<>(cs);
		Customer c1 = new Customer("manasa", 10, 10000);
		Customer c2 = new Customer("navya", 5, 25000);
		Customer c3 = new Customer("srujana", 6, 20000);
		Customer c4 = new Customer("swetha", 11, 30000);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		System.out.println("******using Iterator");
		Iterator<Customer> i = t.iterator();
		while(i.hasNext()) {
			Customer c = i.next();
			System.out.println(c.name);
			System.out.println(c.id);
			System.out.println((c.salary));
			
		}
		
		
		
		
		
		}

}

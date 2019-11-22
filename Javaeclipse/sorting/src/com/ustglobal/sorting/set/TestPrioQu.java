package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPrioQu {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new  PriorityQueue<>();
		pq.add(12);
		pq.add(11);
		pq.add(10);
		pq.offer(20);
		System.out.println("******using iterator");
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println(pq);
		
		
	}

}

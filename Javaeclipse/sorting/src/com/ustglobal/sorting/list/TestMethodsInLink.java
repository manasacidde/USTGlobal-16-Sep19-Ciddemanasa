package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestMethodsInLink {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(11);
		l.add(12);
		l.add(32);
		l.add(35);
		System.out.println(l);
		Integer peekElement = l.peek();
		System.out.println("peek element " +peekElement);
		
		Integer peekFirstElement = l.peekFirst(); 
		System.out.println("peek first" +peekFirstElement);
		
		Integer peekLast = l.peekLast();
		System.out.println("peek last "+peekLast);
		System.out.println("after peek========="+l);
		
		
		
		Integer pollEle= l.poll();
		System.out.println("poll element is "+pollEle);
		System.out.println(l);
		Integer pollFirst = l.pollFirst();
		System.out.println("poll first "+pollFirst);
		System.out.println(l);
		Integer pollLast = l.pollLast();
		System.out.println("poll last" +pollLast); 
		System.out.println("after poll "+l);
		
		l.push(10);
		System.out.println("after push=====" +l);
		l.pop();
		System.out.println("after pop "+l);
		
		
		
		
	}

}

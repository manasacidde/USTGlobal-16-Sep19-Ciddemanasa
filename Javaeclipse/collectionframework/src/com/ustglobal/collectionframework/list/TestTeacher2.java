package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestTeacher2 {

public static void main(String[] args) {
		

		Stack<Teacher> a = new Stack<Teacher>();
		Teacher e1 = new Teacher(1, "manasa", 10000);
		Teacher e2 = new Teacher(2, "navya", 20000);
		Teacher e3 = new Teacher(3, "srujana", 30000);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		for (int i = 0; i < a.size(); i++) {
			Teacher t = a.get(i);
			System.out.println("id is "+t.id);
			System.out.println("name is "+t.name);
			System.out.println("salary is "+t.salary);
			
		}
		System.out.println("for each");
		for(Teacher t:a) {
			System.out.println(t);
		}
		
		System.out.println("using iterator");
		Iterator i = a.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("using listiterator");
		ListIterator li = a.listIterator();
		System.out.println("forward");
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		System.out.println("backward");
		while(li.hasPrevious()) {
			Object o = li.previous();
					System.out.println(o);
		}
		
	}
	}






package com.ustglobal.thread.properties;

public class MyThread extends Thread  {
	public static void main(String[] args) {
		System.out.println("main started");
		String t = Thread.currentThread().getName();
		System.out.println("current thread name is "+t);
		
		Thread.currentThread().setName("manasa");
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("mythread name "+mname);
		
		t1.setName("padma");
		System.out.println("my thread name "+t1.getName());
		
		
		
		System.out.println(10/0);

		System.out.println("main ended");
	}

}

package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	public static void main(String[] args) {
		System.out.println("main started");
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread m = new MyIdThread();
		
		System.out.println(m.getId());
		
//		Thread.currentThread().setPriority(16);
//		System.out.println(Thread.currentThread().getPriority());  IllegalArgumentException
		
		
		System.out.println("main ended");
	}

}

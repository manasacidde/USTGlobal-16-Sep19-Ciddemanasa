package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c = new Car(10000," kia", "red");
		int h = c.hashCode();
		System.out.println(h);
		System.out.println(c);
		Car c1 = new Car(20000," bmw", "blue");
		int h1 = c1.hashCode();
		System.out.println(h1);
		System.out.println(c1);
		
	} 

}

package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p=new Marker();
		p.write();
		System.out.println(p.cost);
		Marker m=(Marker)p;
		System.out.println(m.size);
		m.color();
		m.write();
		System.out.println(m.cost);
	
	}

}

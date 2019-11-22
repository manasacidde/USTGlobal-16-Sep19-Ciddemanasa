package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color=color;
	}
	
	@Override
	public int compareTo(Pen o) {
		Double i = this.price;
		Double j= o.price;
		return i.compareTo(j);
	}

}

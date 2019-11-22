package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30};

		receive(nums);
		int[] values=getArray();
		for(int i=0;i<values.length;i++) {
		System.out.println(values[i]);}
	}
	static void receive(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
		static int[] getArray() {
			int[] values= {10,50};
			return values;
		}

}

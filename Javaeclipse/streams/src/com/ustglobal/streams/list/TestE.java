
package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(30);
		marks.add(35);
		marks.add(45);
		marks.add(89);
		Comparator<Integer> c = (m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}
			else {
				return 0;
			}
		};
		
		long noOfFailed=marks.stream().filter(i->i<40).count();
		System.out.println(+noOfFailed);
		
		Integer i =marks.stream().min(c).get();
		System.out.println(i);
		
		Integer i1 =marks.stream().max(c).get();
		System.out.println(i1);
		
	}

}

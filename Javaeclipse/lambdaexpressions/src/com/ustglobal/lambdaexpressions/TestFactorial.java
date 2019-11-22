package com.ustglobal.lambdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {
		FactorialInterface fi = n->{
			int f=1;
			for(int i =1;i<=n;i++) {
				f=f*i;
				
			}
			System.out.println(f);
		};
		fi.fact(5);
	}

}

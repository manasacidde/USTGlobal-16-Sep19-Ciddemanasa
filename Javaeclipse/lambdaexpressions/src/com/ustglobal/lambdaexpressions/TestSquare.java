package com.ustglobal.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		SquareInterface sq = x->x*x;
		System.out.println(sq.square(4));
	}

}

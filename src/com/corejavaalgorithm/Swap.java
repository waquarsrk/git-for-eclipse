package com.corejavaalgorithm;

public class Swap {

	public static void main(String[] args) {
		// using third variable
		System.out.println("Using third variable");
		int a, b;
		a = 10;
		b = 20;
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		// without using third varaiable
		System.out.println("Without using third variable");
		int x, y;
		x = 10;
		y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x value is :" + x);
		System.out.println("y value is :" + y);

	}

}

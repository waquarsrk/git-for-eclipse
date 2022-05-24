package com.corejavaalgorithm;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		String yn;
		do
		{
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number % 2 == 0) {
			System.out.println("number is even..!! ");
		} else {
			System.out.println("number is odd...!!");
		}
		System.out.println("Do you want to continue(PRESS Y or y for yes and n for NO )");
		yn=s.next();

	}while(yn.equals("Y")||yn.equals("y"));
		System.out.println("Thanks....");
	}

}

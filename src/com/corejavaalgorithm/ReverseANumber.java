package com.corejavaalgorithm;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to be reverse");
		int no=s.nextInt();
		int rem, rev = 0;
		while (no != 0) 
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("reverse no. is" +rev);
		System.out.println("___________");
		int No=no%10;
		System.out.println(No);
		

	}

}

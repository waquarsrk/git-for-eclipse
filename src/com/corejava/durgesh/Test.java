package com.corejava.durgesh;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reassignments

		// int a=50;
		// System.out.println(a);
		// a=100;
		// System.out.println(a);

		// Type-Casting

		// int i=50;
		// double d=i;
		// System.out.println(d);
		// System.out.println(i);

		// double value=10.5;
		// int intValue=(int)value;
		// System.out.println(intValue);

		// Java Operators
		// int a1=20;
		// a1+=50;
		// System.out.println(a1);

		// if-else statements
		int x = -4;
		if (x > 0) 
		{
			// true block
			System.out.println(" yes it is ");

		} 
		else 
		{
			// false block
			System.out.println("it is not");
		}

		// ladder if
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = s.nextInt();
		// int marks=61;
		if (marks > 85) 
		{
			System.out.println("Grade A");

		} 
		else if (marks < 85 && marks >= 65) 
		{
			System.out.println("Grade B");

		}
		else if (marks < 65 && marks >= 35) 
		{
			System.out.println("Grade C");

		}
		else 
		{
			System.out.println("Sorry you are FAIL");
		}
		
		//nested if
		int num=26;
		if (num>0) 
		{
			if (num%2==0) 
			{
				System.out.println("it is even and greater then 0");
				
			}
			
		}
		
		// switch statement
		
		
		

	}
}

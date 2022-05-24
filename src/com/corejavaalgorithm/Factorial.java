package com.corejavaalgorithm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number to be factorial...");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of  "+no+" is : "+fact);
	}

}

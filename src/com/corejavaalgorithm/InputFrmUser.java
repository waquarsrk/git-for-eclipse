package com.corejavaalgorithm;

import java.util.Scanner;

public class InputFrmUser {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = s.next();
		System.out.println("Enter your Age:");
		int age = s.nextInt();
		System.out.println("Enter your gender");
		char gender = s.next().charAt(0);
		System.out.println("Enter your phone no.");
		long phoneNo=s.nextLong();
		System.out.println("Name is:"+name+" Phone No : "+phoneNo+" Gender : "+gender+" Age :"+age);
	}

}

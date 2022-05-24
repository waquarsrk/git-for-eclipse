package com.corejavaalgorithm;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  any number to print Table : ");
		int number = s.nextInt();
		for(int i=1;i<=10;i++) {
			int result=number*i;
			System.out.println(number+"x"+i+"="+result);
		}

	}

}

package com.corejavaalgorithm;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int no1 = s.nextInt();
			System.out.println("Enter second number : ");
			int no2 = s.nextInt();
			System.out.println("Select Operation which is to be performed...");
			System.out.println("+,-,/,*");
			String sym = s.next();
			int res;
				switch (sym) {
				case "+":
					res = no1 + no2;
					System.out.println("Addition is : " + res);
					break;

				case "-":
					res = no1 - no2;
					System.out.println("Substraction is : " + res);
					break;

				case "*":
					res = no1 * no2;
					System.out.println("Multiplication is : " + res);
					break;

				case "/":
					res = no1 / no2;
					System.out.println("Division is : " + res);
					break;

				default:
					System.out.println("Invalid Symbol...");
					break;
				}
		
			
			System.out.println("Do yo want to continue (Press y for YES and n for NO)");
			yn =s.next();
			 
		}while(yn.equals("y")||yn.equals("Y"));
		System.out.println("Thank you for using my calculator...!!");
}

}

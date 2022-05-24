package com.corejava.durgesh;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day : ");
		String day = s.next();

		switch (day) {
		case "MON": 
			System.out.println("the day is MONDAY");
			break;
			
		case "TUE":
			System.out.println("the day is TUESDAY");
			break;
			
		case "WED":
			System.out.println("the day is WEDNESDAY");
			break;
			
		case "THU":
			System.out.println("the day is THURSDAY");
			break;
			
		case "FRI":
			System.out.println("the day is FRIDAY");
			break;
			
		case "SAT":
			System.out.println("the day is SATURDAY");
			break;
			
		case "SUN":
			System.out.println("the day is SUNDAY");
			break;	
			
		default :
			System.out.println("Invalid Entry");

		}
		}
	}

package com.corejavaalgorithm;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int temp = 0;
		for (int i = 2; i <= number - 1; i++) 
		{
			if (number % i == 0) 
			{
				temp=temp+1;
			}
		}if(temp>0)
		{
			System.out.println(number+" is not prime");
		}
		else {
			System.out.println(number+" is prime");
		}

	}

}

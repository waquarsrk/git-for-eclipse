package com.corejava.durgesh;

public class Loop {
	public static void main(String[] args) {
		// for loop
		// print 1 to 10 number
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("__________________");
		
		// print odd numbers from 1 to 10
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		System.out.println("_______________-");
		
		// number print in reverse order
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		System.out.println("_____________");
		
		//while loop
		int j=100;
		while(j<=120)
		{
			System.out.println(j);
			j++;			
		}
		System.out.println("________________");
		
		//for each loop
		int [] x= {10,23,11,45,88,20,60};
		for(int e:x)
		{
			System.out.println(e);
		}
	}

}

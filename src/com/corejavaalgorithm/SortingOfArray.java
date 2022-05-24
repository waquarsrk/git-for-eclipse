package com.corejavaalgorithm;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] countries= {"India","United States","Turkey","Sri Lanka","Australia"};
		Arrays.sort(countries);
		
		
		for(int i=0;i<countries.length;i++)
		{
			System.out.println("Countries : "+countries[i]);
		}

	}

}

package com.corejavaalgorithm;

public class ReverseString {

	public static void main(String[] args) {
		String name = "ShahRukhKhan";
		int length=name.length();
		//System.out.println(length);
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);

	}

}

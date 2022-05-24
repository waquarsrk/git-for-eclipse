package com.corejavaalgorithm;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList<String>();

		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");

		String[] stringArrayObject = new String[al.size()];
		System.out.println(stringArrayObject);
		al.toArray(stringArrayObject);

		for (String temp : stringArrayObject)
		{
			System.out.println(temp);

	}
	}
}
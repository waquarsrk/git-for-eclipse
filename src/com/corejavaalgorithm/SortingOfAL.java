package com.corejavaalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOfAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Saddam");
		list.add("Kazim");
		list.add("Kazim");
		list.add("Waquar");
		list.add("1212");
		list.add("null");
		list.add("null");
		list.add("Aquib");
		list.add("Tony Stark");
		
		System.out.println(list);
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
			
		}

	}

}

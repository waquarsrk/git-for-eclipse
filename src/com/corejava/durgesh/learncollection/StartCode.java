package com.corejava.durgesh.learncollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class StartCode {
	public static void main(String[] args) {
		System.out.println("i am learning collection");
		ArrayList<String> names=new ArrayList<String>();
		names.add("Waquar");
		names.add("Ahmad");
		names.add("vicky");
		names.add("Ahmad");
		System.out.println(names);
//		System.out.println(names.get(0));
//		System.out.println(names.get(3));
//		
//		Collection<String> list=new ArrayList<String>();
//		list.add("Shahrukh");
//		list.add("Khan");
//		System.out.println(list);
		
		names.remove(3);
		names.remove("vicky");
		System.out.println(names);
		System.out.println("Size of AL is "+names.size());
		System.out.println(names.contains("Waquar Rizvi"));
		System.out.println(names);
		names.set(1, "Aquib");
		System.out.println(names);
		names.add(0, "SRK");
		System.out.println(names);
		System.out.println("___________________________");
		
		HashSet<Double> nmbs=new HashSet<Double>();
		nmbs.add(12.23);
		nmbs.add(874.6);
		nmbs.add(2.5);
		nmbs.add(90.25);
		nmbs.add(2.5);
		System.out.println(nmbs);
		
		TreeSet<Double> nmbs1=new TreeSet<Double>();
		nmbs1.addAll(nmbs);
		System.out.println(nmbs1);
	}

}

package com.corejava.durgesh;

public class Student {
	int studentId;
	String studentName;
	String studentCity;

	public Student() {
		System.out.println("creating obj : Non paramaterized constructor");
	}

	public Student(int i) {
		System.out.println("creating obj : parametrized constructor");
	}

	public Student(int a, String name, String city) {
		System.out.println("Overloaded constructor");
		studentId=a;
		studentName=name;
		studentCity=city;
	}

	public void study() {
		System.out.println("Hi my name is" + studentName);
	}

	public void showDetails() {
		System.out.println("My name is " + studentName);
		System.out.println("My id is " + studentId);
		System.out.println("My city is " + studentCity);
	}

}

package com.corejavadurga.abstrat;

public class Student extends Person {
	private int age;
	private int marks;
	public Student(String name, int roollNo, int age, int marks) {
		super(name, roollNo);
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", marks=" + marks + "]";
	}

}

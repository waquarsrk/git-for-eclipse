package com.corejavadurga.abstrat;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry();
		
		B b=new B();
		b.m3();

		Auto a = new Auto();
		a.getNoOfWheels();

		Car c = new Car();
		c.getNoOfWheels();
		
		Student s=new Student("Waquar", 56, 26, 98);
		System.out.println(s.toString());
		
	
	}
	
	
}

package com.corejava.durgesh;

public class Demo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentId=123;
		s1.studentName="Waquar";
		s1.studentCity="Pusad";
		
		Student s2=new Student(12);
		s2.studentId=369;
		s2.studentName="Vicky";
		s2.studentCity="Mumbai";
		
		Student s3=new Student(569, "Don", "Pune");
		s3.study();
		s3.showDetails();
		
		s2.study();
		s2.showDetails();
		
		s1.study();
		s1.showDetails();
		}

}

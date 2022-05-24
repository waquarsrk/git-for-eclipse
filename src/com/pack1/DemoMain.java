package com.pack1;

public class DemoMain 
{
	static int leela;
	{
		leela=54;
	}
	final int abc=123;
	public static void main(String[] args) 
	{
		
		final int zozo;
		System.out.println("Hi i am the king..@@");
		System.out.println(leela);
		Child child = new Child();
		child.marry(); // Tara Sutaria
		Parent parent = new Parent();
		parent.marry(); // Alia Bhatt
		Parent p = new Child();
		p.marry(); // Tara Sutaria
					// Run Time polymorphism

		AutoRickshaw auto = new AutoRickshaw();
		int noOfWheels = auto.NoOfWheels();
		System.out.println(noOfWheels);

		ChildAb ch = new ChildAb();
		int noOfWheels2 = ch.NoOfWheels();
		System.out.println(noOfWheels2);

		// Abstract ab=new Abstract();

		// Coffee cof=new Coffee();
		DemoMain demo=new DemoMain();
		System.out.println(demo.abc);
		System.out.println("--------------------");

		A a = new A();
		a.happy();
		
		
		final int zoo;
		{
			zoo=600;
		}
		
		final int rocky=900;
	
		
	}
	public DemoMain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void method1()
	{
		// rocky =500;
	}
}

package com.pack1;

public class Cat {
	static int x=10;
	int y=20;
	public static void main(String[] args) {
		x=30;
		System.out.println(x);
		// System.out.println(Cat.x);
		System.out.println("i am string[] args method");
		Cat cat=new Cat();
		cat.x=888;
		cat.y=999;
		Cat cat1=new Cat();
		System.out.println(cat1.x+" "+cat.x+" "+cat.y);
		System.out.println(cat.x+" "+cat1.y);
		
	}

	public static void main(int[] args)
	{
		System.out.println("i am int[] args method");
	}

	
}

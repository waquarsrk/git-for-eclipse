package com.corejava.durgesh;

public class BreakContinueExample {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			if(i==50)
			{
				continue;
			}
			if(i==40)
			{
				break;
			}
			System.out.println("end");
		}
	}

}

package com.corejavaalgorithm;

public class FindDupElementInArrayUsingLoop {

	public static void main(String[] args) {
		int[] inputNumberArray = { 10, 20, 20, 50, 60, 60, 80, 45, 100, 100 };
		for (int i = 0; i < inputNumberArray.length; i++) {
			for (int j = i + 1; j < inputNumberArray.length; j++) {
				if (inputNumberArray[i] == inputNumberArray[j]) {
					System.out.println("Duplicate element found : " + inputNumberArray[j]);

				}

			}

		}

	}

}

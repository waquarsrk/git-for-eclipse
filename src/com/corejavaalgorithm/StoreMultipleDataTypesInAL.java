package com.corejavaalgorithm;

import java.util.ArrayList;

public class StoreMultipleDataTypesInAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("Saddu");
		al.add(121);
		al.add(12.5f);

		for (int i = 0; i < al.size(); i++) {
			Object object = al.get(i);

			if (object instanceof String || object instanceof Integer || object instanceof Float);
			{
				System.out.println(object.toString());
			}
		}

	}

}

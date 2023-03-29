package com.javaprogram.example;

import java.util.ArrayList;
import java.util.List;

public class ListForIntegerValuePrograms {
	public static void main(String args[]) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);

		for (Integer singleStringValue : obj) {
			System.out.println("Values of list :- " + singleStringValue);
			
		}
	}
}

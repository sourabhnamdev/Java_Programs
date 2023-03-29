package com.javaprogram.example;

import java.util.HashSet;
import java.util.Set;

public class SetPrograms {
	public static void main(String args[]) {
		Set<Integer> obj = new HashSet<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(5);
		obj.add(4);
		obj.add(5);

		for (Integer singleStringValue : obj) {
			System.out.println("Values of list :- " + singleStringValue);

		}
	}
}

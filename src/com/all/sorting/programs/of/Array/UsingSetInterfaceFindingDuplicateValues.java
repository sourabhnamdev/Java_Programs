package com.all.sorting.programs.of.Array;

import java.util.HashSet;
import java.util.Set;

// Using set interface finding duplicate elements in array bcz set always return unique values 
public class UsingSetInterfaceFindingDuplicateValues {
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 5, 2 };
		Set<Integer> setValues = new HashSet<Integer>();
		for (Integer value : a) {
			boolean add = setValues.add(value);
			if (!add) {
				System.out.println(value);
			}
		}
	}
}

package com.all.sorting.programs.of.Array;

import java.util.HashSet;
import java.util.Set;

public class UsingSetInterfaceFindSecondLargestElementInGivenArray {
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 0, 5 };
		Set<Integer> setValues = new HashSet<Integer>();
		for (Integer integer : a) {
			setValues.add(integer);
		}
		Object[] array = setValues.toArray();
		System.out.println(" Second Smallest Element in Given Array :- " + array[array.length - 2]);

	}
}

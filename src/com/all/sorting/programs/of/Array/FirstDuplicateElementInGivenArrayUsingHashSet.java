package com.all.sorting.programs.of.Array;

import java.util.HashSet;

public class FirstDuplicateElementInGivenArrayUsingHashSet {
	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 7, 3, 2, 4, 7 };
		int temp = -1;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = a.length - 1; i >= 0; i--) {
			if (hs.contains(a[i])) {
				temp = i;
			} else {
				hs.add(a[i]);
			}
		}
		if (temp != -1) {
			System.out.println("First Duplicate Element :- " + a[temp]);
		} else {
			System.out.println("Duplicate element in given array ");
		}

	}
}
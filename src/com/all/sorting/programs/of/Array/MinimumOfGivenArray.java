package com.all.sorting.programs.of.Array;

public class MinimumOfGivenArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 7 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min value of the given array :- " + min);
	}
}

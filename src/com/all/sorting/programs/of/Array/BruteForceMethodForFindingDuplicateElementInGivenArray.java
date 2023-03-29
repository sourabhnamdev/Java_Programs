package com.all.sorting.programs.of.Array;

public class BruteForceMethodForFindingDuplicateElementInGivenArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 2, 6, 1, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.print(a[i] + "  ");
				}
			}
		}
	}
}

package com.all.sorting.programs.of.Array;

public class FirstDuplicateElementInGivenArray {
	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 4, 7, 3, 2, 5, 3, 7 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					System.out.println("First Duplicate element in Array :- " + a[i]);
					temp++;
					break;
				}
			}
			if (temp == 1) {
				break;
			}
		}
	}
}

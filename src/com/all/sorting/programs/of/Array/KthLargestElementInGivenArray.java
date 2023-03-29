package com.all.sorting.programs.of.Array;

public class KthLargestElementInGivenArray {
	public static void main(String[] args) {
		int a[] = { 4, 3, 2, 5, 1, 6 };
		int k = 4, temp; // for finding 4thlargest number
		// K is the dynamic for finding any largest number in array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(a[i]);
			}
		}
	}
}

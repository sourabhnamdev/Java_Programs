package com.all.sorting.programs.of.Array;

public class SecondSmallestElementInGivenArray {
	public static void main(String[] args) {
		int a[] = { 3, 5, 2, 1, 4, 6, 7 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) { // traversing in assending order
				if (a[i] > a[j]) {			
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == 1) { // did not need to traverse whole array bcz we need only 2 iterate
				break;
			}
		}
		System.out.println("second smallest element in given array is :- " + a[1]);
	}
}

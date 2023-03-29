//Java program for implementation of Selection Sort
package com.all.sorting.algorithm.of.array;

public class SelectionSortProgramExample {
	public static void main(String[] args) {
		int array[] = { 3, 1, 6, 2, 5, 9 };
		int n = array.length;
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Selection Sort of Array :- ");
		int f = array.length;
		for (int i = 0; i < f; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}

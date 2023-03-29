package com.all.sorting.programs.of.Array;

public class SimpleSortingProgram {
	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 1, 4 };
		System.out.print("Before Sorting Array :-\n");
		for (int i : array) {
			System.out.print(i);
		}
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
		
		

		System.out.print("\nAfter Sorting Array :-\n");
		for (int i : array) {
			System.out.print(i);
		}
	}
}

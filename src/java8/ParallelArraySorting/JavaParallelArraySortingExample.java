package java8.ParallelArraySorting;

import java.util.Arrays;

public class JavaParallelArraySortingExample {
	public static void main(String[] args) {
		// Creating an integer array
		int[] arr = { 5, 8, 1, 0, 6, 9 };
		System.out.println("\nArray elements before sorting\n");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		//======================================
        //Sorting Based on From index to To Index
//		Arrays.sort(arr);
		Arrays.sort(arr,0,3);
		System.out.println("\nArray elements after sorting using sort()\n");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		//======================================
		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting using paralletSort()\n");
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}

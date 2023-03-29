package com.javaprogram.array;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] w = { 1, 2, 4, 6, 3, 7, 8 };
		Arrays.sort(w); // Sort the array

		int n = w.length;
		int missing = 0;

		for (int i = 0; i < n - 1; i++) {
			if (w[i + 1] - w[i] != 1) {
				missing = w[i] + 1;
				System.out.println("Missing element is: " + missing);
			}
		}

		// 2nd Way
		// ============================

		int[] arr = { 1, 2, 4, 6, 3, 7, 8 };
		int sum = 0;
		int l = arr.length;

		// Calculate sum of all elements in the array
		for (int i = 0; i < l; i++) {
			sum += arr[i];
		}

		// Calculate sum of series
		int seriesSum = (l + 1) * (l + 2) / 2;

		// Subtract sum of array elements from sum of series to get missing element
		int missingElement = seriesSum - sum;

		System.out.println("Missing element is: " + missingElement);

	
	}
}

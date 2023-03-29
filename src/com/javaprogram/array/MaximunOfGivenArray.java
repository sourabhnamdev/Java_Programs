package com.javaprogram.array;

public class MaximunOfGivenArray {
	public static void main(String[] args) {
		int[] array = { 2, 1, 10, 6, 4, 3, 6, 12 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
				}
			}
		}
		System.out.println(" maximun number of the given array is :- " + max);
	}
}

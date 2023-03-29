package com.javaprogram.array;

public class MinimumOfGivenArray {
	public static void main(String[] args) {
		int[] array = { 2, 10, 6, 4, 3, 6, 12 };
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
				}
			}
		}
		System.out.println(" minimun number of the given array is :- " + min);
	}
}

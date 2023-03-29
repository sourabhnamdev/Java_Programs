package com.javaprogram.example;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int arr[] = { 22, 50, 12, 90, 2 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("lagest element of array is :- " + max);

	}
}

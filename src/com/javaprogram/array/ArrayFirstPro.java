package com.javaprogram.array;

//1. How to find the missing number in integer array of 1 to 10?
public class ArrayFirstPro {
	public static void main(String[] args) {
		int arry[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int length = arry.length;
		findDistingelemment(arry, length);
	}

	private static void findDistingelemment(int[] arry, int length) {

		for (int i = 0; i < length; i++) {
			if (i == arry[i]) {
			}
		}
	}
}

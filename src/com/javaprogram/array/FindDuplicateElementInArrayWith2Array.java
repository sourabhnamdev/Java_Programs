package com.javaprogram.array;

public class FindDuplicateElementInArrayWith2Array {
	public static void main(String[] args) {
		int a[] = { 2, 4, 2, 1, 5 };
		int b[] = { 1, 6, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}

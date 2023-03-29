package com.javaprogram.array;

public class FindDuplicateElementInArrayWith3Array {
public static void main(String[] args) {
	int a[] = { 2, 4, 2, 1, 5, 6, 7, 8, 0 };
	int b[] = { 1, 4, 6};
	int c[] = { 2, 4, 2, 1, 5, 6, 7, 8, 0 };
	int d[] = { 2, 4, 2, 1, 5, 6, 7, 8, 0 };
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			for (int j2 = 0; j2 < c.length; j2++) {
				for (int k = 0; k < d.length; k++) {
					if (a[i] == b[j] && a[i] == c[j2] && a[i] == a[k]) {
						System.out.println(a[i]);
					}
				}
			}
		}
	}
}
}

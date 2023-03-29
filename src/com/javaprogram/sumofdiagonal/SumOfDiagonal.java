package com.javaprogram.sumofdiagonal;

public class SumOfDiagonal {
	public static void main(String[] args) {
//		int arr[] = { 8, 3, 1, 2 };
		int arr[][] = { { 3, 1, 2, 8 }, { 1, 2, 8, 3 }, { 2, 8, 3, 1 }, { 8, 3, 1, 2 } };
		System.out.print(productDiagonals(arr, 4) + "\n");
	}

	static int productDiagonals(int arr[][], int n) {
		int product = 1;
		for (int i = 0; i < n; i++) {
			product = product * arr[i][i];
//	        product = product * arr[i][n - i - 1];
		}
		if (n % 2 == 1) {
			product = product / arr[n / 2][n / 2];
		}
		return product;
	}
}

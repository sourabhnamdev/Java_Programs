package com.all.sorting.programs.of.Array;

//To Find Signle Value Of Array
public class FindTheElementThatAppearOnceInTheGivenArrayUsingXOR {
	public static void main(String[] args) {
		int a[] = { 1, 6, 2, 8, 8, 1, 2 };
		int res = a[0];
		for (int i = 1; i < a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println(res);
	}
}

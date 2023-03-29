package com.javaprogram.array;

import java.util.Scanner;

public class ContainOrNotArrayElements {
public static void main(String[] args) {
	int a[]= {2,4,1,4,0};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number Bro :- ");
	int nextInt = sc.nextInt();
     	
    for (int i : a) {
		if (nextInt==i) {
			System.out.println("Array Contain Element" + i);
		}
	}
}
}

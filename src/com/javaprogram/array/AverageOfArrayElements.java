package com.javaprogram.array;

public class AverageOfArrayElements {
public static void main(String[] args) {
	int a[]= {2,1,4,3,5};
	int sum=0;
	double average;
	for (int i : a) {
		  sum=sum+i;
	}
	average= sum / a.length;
	System.out.println(average);
}
}

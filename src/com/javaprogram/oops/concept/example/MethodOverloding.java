package com.javaprogram.oops.concept.example;

class Addition {
	void add(int a, int b) {
		System.out.println(a + b);

	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class MethodOverloding {
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(1, 2);
		addition.add(1, 2, 3);
	}
}

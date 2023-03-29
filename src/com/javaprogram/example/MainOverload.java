package com.javaprogram.example;

public class MainOverload {
	public static void main(int a) {
		System.out.println("abc");
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("2");
		MainOverload a = new MainOverload();
		a.main(80);
	}
}

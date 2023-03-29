package com.javaprogram.construtor;

class Test2 {
	int id;
	String s;
	Test2(int id) {
		System.out.println(id + " " + s);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Test2 test = new Test2(5);
	}
}

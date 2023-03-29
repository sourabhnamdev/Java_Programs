package com.javaprogram.example;

public class StaticKeyword {

	private int id;
	private String name;
	static String company = "it";

	public StaticKeyword(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println(id + "  " + name + "  " + company);

	}

	public static void main(String[] args) {

		StaticKeyword sc = new StaticKeyword(1, "priyanka");
		StaticKeyword sc1 = new StaticKeyword(3, "sourabh");

	}

}

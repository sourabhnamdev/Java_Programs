package com.javaprogram.strings;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "hello";
		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique.contains(ch + "")) {
				unique += ch;
			}
		}
		System.out.println("String without duplicates: " + unique);
	}
}

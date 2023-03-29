package com.javaprogram.strings;

public class CountWords {
	public static void main(String[] args) {

		String str = "My name is Sourabh";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}

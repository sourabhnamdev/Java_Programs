package com.javaprogram.strings;

public class CountVowels extends CountStringWords {
	public static void main(String[] args) {
		
		String str = "Hello";
		int vowels = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
	}

	
}

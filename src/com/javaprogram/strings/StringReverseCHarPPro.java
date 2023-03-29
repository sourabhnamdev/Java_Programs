package com.javaprogram.strings;

public class StringReverseCHarPPro {
	public static void main(String[] args) {
		String word = "Sourabh";
		char[] characters = word.toCharArray();
		for (int i = 0; i < characters.length / 2; i++) {
			char temp = characters[i];
			int length = characters.length;
			characters[i] = characters[characters.length - 1 - i];
			characters[characters.length - 1 - i] = temp;
			break;
		}
		word = new String(characters);
		System.out.println("Changed word: " + word);
	}
}
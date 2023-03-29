package com.javaprogram.strings;

public class UserDefinedStringMethods {
	public static void main(String[] args) {
		String str = "SOURABH";
		String lowercash = UserDefinedStringMethods.toLowerCash(str);
		System.out.println("String to Lower Cash :-" + lowercash);

		String uppercash = UserDefinedStringMethods.toUpperCash(lowercash);
		System.out.println("String to Upper Cash :-" + uppercash);

		String toGiveSpace = UserDefinedStringMethods.toGiveSpace(str);
		System.out.println("String With Spcaing :-" + toGiveSpace);

		String firstBigSecondSmall = UserDefinedStringMethods.toFirstBigSecondSmall(str);
		System.out.println("String firstBigSecondSmall:-" + firstBigSecondSmall);

		String reverse = UserDefinedStringMethods.toReverse(str);
		System.out.println("String with reverse:-" + reverse);

		String removeVowels = UserDefinedStringMethods.removeVowels(str);
		System.out.println("Remove Vowels From String : " + str + " to :- " + removeVowels);

		String checkingStrinfTest = "S1O2U3R4A5B6H";
		String checkingString = UserDefinedStringMethods.fetchingOnlyString(checkingStrinfTest);
		System.  out.println("checking String : " + checkingString);

		String sentence = "This is my String Words";
		String wordsOfString = UserDefinedStringMethods.CountWords(sentence);
		System.out.println("words of sentence : [" + sentence +"] is :- "+ wordsOfString);
	}

	// ------------User Defined String Methods-----------------

	public static String toLowerCash(String str) {
		return str.toLowerCase();
	}

	public static String toUpperCash(String str) {
		return str.toUpperCase();
	}

	public static String toGiveSpace(String str) {
		char[] charArray = str.toCharArray();
		String addString = "";
		for (char c : charArray) {
			addString = addString.concat(" " + c);
		}
		return addString;
	}

	public static String toFirstBigSecondSmall(String str) {
		String addString = "";
		char[] charArray = str.toCharArray();
		int length = charArray.length;

		for (char c : charArray) {
			if (length % 2 == 0) {
				String valueOf = addString.valueOf(c).toLowerCase();
				addString = addString.concat("" + valueOf);
				length--;
			} else {
				String valueOf = addString.valueOf(c).toUpperCase();
				addString = addString.concat("" + valueOf);
				length--;
			}
		}
		return addString;
	}

	public static String toReverse(String str) {
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString.concat("" + str.charAt(i));
		}
		return reverseString;
	}

	public static String removeVowels(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		String withoutVowels = "";
		for (char c : charArray) {
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				withoutVowels = withoutVowels.concat("" + c);
			}
		}
		return withoutVowels;
	}

	public static String fetchingOnlyString(String str) {
		char[] charArray = str.toCharArray();
		String addString = "";
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			int castAscii = (int) ch;
			if (castAscii > 65 && castAscii < 90) {
				addString = addString.concat("" + ch);
			} else if (castAscii > 97 && castAscii < 128) {
				addString = addString.concat("" + ch);
			}

		}
		return addString;
	}

	public static String CountWords(String str) {
		return "" + str.split(" ").length;
	}
}

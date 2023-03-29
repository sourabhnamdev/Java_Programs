package com.javaprogram.strings;

public class CountStringWords {
	public static void main(String[] args) {
         String s = "sour";
		String inputString = "Arise Awake";
		System.out.println("The input string is : \n" + inputString + "\n");
		CountStringWords obj = new CountStringWords();
		System.out.println("Count words using split() method: " + obj.countWordsUsingSplit(inputString));
	}

	// method to count words using the split() method
	public final  int countWordsUsingSplit(String inputString) {

		String[] stringArray = inputString.split("\\s+"); // splitting the string using space/spaces
		return stringArray.length; // returning the length of the array i.e number of words in the string
	}
}

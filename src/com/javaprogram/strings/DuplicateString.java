package com.javaprogram.strings;

import java.applet.Applet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString extends Applet {
//	public static void main(String[] args) {
//		String[] arr = { "sourabh", "monit", "vijay", "monit", "sourabh" };
//		int count, i, j;
//		for (i = 0; i < arr.length; i++) {
//			count = 1;
//			for (j = i + 1; j < arr.length; j++) {
//				if (arr[i].equals(arr[j])) {
//					count++;
//					arr[j] = "0";
//				}
//			}
//			if (count > 1 && arr[i] != "0")
//				System.out.println(arr[i]);
//		}
//	}

	public static void main(String[] args) {

	
		System.out.println("Enter the duplicate sentence to print duplicate values :- \n");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");

		Map<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	
	
}

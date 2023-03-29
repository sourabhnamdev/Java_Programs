package com.javaprogram.example;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> obj = new TreeMap<Integer, String>();
		obj.put(1, "sourabh");
		obj.put(2, "rishabh");
		obj.put(5, "aamit");
		obj.put(3, "sourabh");
		obj.put(4, "rishabh");

		for (Entry<Integer, String> mapValue : obj.entrySet()) {
			System.out.println("Keys  :-" + mapValue.getKey());
			System.out.println("Values :-" + mapValue.getValue());
		}

	}

}
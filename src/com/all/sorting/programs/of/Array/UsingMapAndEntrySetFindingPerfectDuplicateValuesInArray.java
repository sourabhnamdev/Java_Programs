package com.all.sorting.programs.of.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingMapAndEntrySetFindingPerfectDuplicateValuesInArray {
	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 3, 3, 4, 5, 2 };
		Map<Integer, Integer> hm = new HashMap<>();
		for (int no : a) {
			Integer count = hm.get(no);
			if (count == null) {
				hm.put(no, 1);
			} else {
				count++;
				hm.put(no, count);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
		for (Entry<Integer, Integer> es : entrySet) {
			if (es.getValue() > 1) {
				System.out.println(es.getKey());
			}
		}
	}
}

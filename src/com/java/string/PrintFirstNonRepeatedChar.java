package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Abu
 */

public class PrintFirstNonRepeatedChar {

	public static void main(String[] args) {

		/*
		 * To print first non repeated character of a string Best data structure to use
		 * is LinkedHashMap because it present value as there appear or they are entered
		 */
		String x = "Abubakar";
		x = x.toLowerCase();
		char[] y = x.toCharArray();
		int size = y.length;

		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldvalue = map.get(y[i]);
				int newVal = oldvalue + 1;
				map.put(y[i], newVal);
			}

			++i;
		}

		Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : lmap) {
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
				System.exit(0);
			}

		}

	}

}

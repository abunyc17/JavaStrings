package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Abu
 */

public class UniqueStringCheck {
	
	public static void main(String[] args) {
		
		String x = "SpiderMan";
		char[] y = x.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int i = 0;
		while(i != size) {
			
			if(map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			}else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		
		for( Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue() > 1) {
				System.out.println("Does not contain unique characters");
				System.exit(0);
			}
			
		}
		System.out.println("Contains unique characters");
		
		
		
		
	}

}



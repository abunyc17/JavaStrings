package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Abu
 */

public class PrintNonRepeatedChar {
	
	public static void main(String[] args) {
		
		String x = "Abubakar";
		x = x.toLowerCase();
		char[] y = x.toCharArray();
		
		int size = y.length;
		Map<Character, Integer> map = new HashMap<>();
		
		int i = 0;
		while(i != size) {
			
			if(map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			}else {
				int oldValue = map.get(y[i]);
				int newValue = oldValue + 1;
				map.put(y[i], newValue);
			}
			++i;
			
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for( Map.Entry<Character, Integer> data: hmap) {			
			if(data.getValue() == 1) {
				System.out.println(data.getKey());
			}
			
		}
		
		
	}

}



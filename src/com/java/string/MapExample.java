package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

;

/**
 * @author Abu
 */

public class MapExample {
	
	public static void main(String[] args) {
		
		//Map cannot contain duplicate keys but can contain duplicate values
		
		String x = "ABUBAKAR";
		char[] y = x.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int i =0;
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
		for(Map.Entry<Character, Integer> data: hmap) {
			System.out.print(data.getKey() + " "); 
			System.out.println(data.getValue());
		}
		
		
		
		
		
	}

}



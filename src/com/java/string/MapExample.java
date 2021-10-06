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
		
		//Different type of Maps in Java - HashMap, LinkedHashMap and TreeMap
		//Similarities: There are all data structure that store their values in Key Value pair.
		
		/*
		 * Difference between maps is in the order in which there store data.
		 * 
		 * Hashmap - Stores data in a random order (based on hash function) 
		 * 
		 * LinkedHashMap: Stores data in co-relation as data are entered, exact order and sequence with d map.
		 * (stores data in same sequence as input)
		 * 
		 * TreeMap: stores data in a sorted order (Ascending order)
		 */
		
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



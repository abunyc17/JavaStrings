package com.java.string;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.crypto.Data;

/**
 * @author Abu
 */

public class PrintMaxOccurenceOfCharacter {

	public static void main(String[] args) {
		
		String x = "Abubakar";
		x = x.toLowerCase();
		char[] y = x.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
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
		
		int maxVal = 0;
		char maxKey = ' ';
		
		Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : lmap) {
			
			
			if(data.getValue() > maxVal)
			{
				maxKey = data.getKey();
				maxVal = data.getValue();
			}		
		}
		
		System.out.println(maxKey);
		System.out.println(maxVal);
		
		

	}

}

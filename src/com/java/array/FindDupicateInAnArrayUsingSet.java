/**
 * 
 */
package com.java.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ${Abubakar Adamu}
 *
 */
public class FindDupicateInAnArrayUsingSet {
	
	public static void main(String[] args) {
		
		int[] inputNumArray = {10, 15,100,50,133, 10, 12, 90, 144, 5};
		
		Set<Integer> duplicateSetNumber = new HashSet<>();
		for(Integer number: inputNumArray) {
			if(!duplicateSetNumber.add(number)) {
				System.out.println("Duplicate element found: " + number);
			}
		}
		
	}

}

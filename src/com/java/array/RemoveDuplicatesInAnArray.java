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
public class RemoveDuplicatesInAnArray {
	
	public static void main(String[] args) {
		int[] inputArrayWithDuplicates = {15, 14, 55, 15, 2, 99, 102, 19, 2, 5, 145, 245, 419, 524, 14};
		Integer[] outputWithoutDuplicate = removeDuplicates(inputArrayWithDuplicates);
		
		System.out.println("Original array");
		for(int element : inputArrayWithDuplicates) {
			System.out.println(element);
			System.out.println(" ");
		}
		
		System.out.println("After Duplicate removal");
		for(int element:outputWithoutDuplicate ) {
			System.out.println(element);
		}
	}
	
	
	private static Integer[] removeDuplicates(int[] input) {
		Set<Integer> set = new HashSet<>();
		for(int removeDup: input) {
			set.add(removeDup);
		}
		Integer[] outputWithoutDuplicate = set.toArray(new Integer[set.size()]);
		return outputWithoutDuplicate;
	}

}

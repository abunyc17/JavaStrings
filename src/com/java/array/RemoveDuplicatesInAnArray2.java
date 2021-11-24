/**
 * 
 */
package com.java.array;

import java.util.Arrays;

/**
 * @author ${Abubakar Adamu}
 *
 */
public class RemoveDuplicatesInAnArray2 {
	
	public static void main(String[] args) {
		
		int[] inputArrayWithDuplicates = {15, 14, 55, 15, 2, 99, 102, 19, 2, 5, 145, 245, 419, 524, 14};
		
		System.out.println("Original array content");
		for(int element: inputArrayWithDuplicates) {
			System.out.println(element);
		}
		
		int outputWithoutDuplicates[] = Arrays.stream(inputArrayWithDuplicates).distinct().toArray();
		System.out.println("Arrays after removing duplicates");
		for(int element : outputWithoutDuplicates) {
			System.out.println(element);
		}
		
	}

}

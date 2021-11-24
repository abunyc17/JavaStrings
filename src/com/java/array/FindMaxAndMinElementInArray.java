/**
 * 
 */
package com.java.array;

/**
 * @author ${Abubakar Adamu}
 *
 */
public class FindMaxAndMinElementInArray {
	
	/*
	 * finding max and min number in a given array
	 */
	public static void main(String[] args) {
		int [] inputNumArray = {10, 14,35,36,389,45,100,91,65,10, 7, 55,60, 100, 45, 5493, 34443};
		
		int maxNumber = inputNumArray[0];
		int minNumber = inputNumArray[0];
		
		for (int i = 0; i < inputNumArray.length; i++) {
			if(maxNumber < inputNumArray[i]) {
				maxNumber = inputNumArray[i];
			}else if(minNumber > inputNumArray[i]) {
					minNumber = inputNumArray[i];
			}
			
		}
		System.out.println("The maximum number: "+maxNumber + " & the minimum number: "+minNumber);
	}

}

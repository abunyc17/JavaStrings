/**
 * 
 */
package com.java.array;

/**
 * @author ${Abubakar Adamu}
 *
 */
public class FindDuplicateInAnArrayUsingLoop {
	
	public static void main(String[] args) {
		int [] inputNumArray = {10, 14,35,36,389,45,100,91,65,10,55,60, 100, 45};
		
		for (int i = 0; i < inputNumArray.length; i++) {
			
			for(int j = i+1; j <inputNumArray.length; j++) {
				if(inputNumArray[i] == inputNumArray[j]) {
					System.out.println("Duplicate Array found: "+ inputNumArray[i]);
				}
			}
		}
	}

}

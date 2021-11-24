/**
 * 
 */
package com.java.array;

/**
 * @author ${Abubakar Adamu}
 *
 */
public class FindCommonElementsFromTwoArrays {
	public static void main(String[] args) {

		int[] inputArray1 = { 10, 14, 35,30, 36, 389, 45, 100, 91, 65, 10, 7, 55, 60, 100, 45, 5493, 34443 };
		int[] inputArray2 = { 15, 25, 30, 91, 85, 44, 556, 458, 105, 47, 85, 5563, 214, 20 };

		// Loop through the first input array
		for (int i = 0; i < inputArray1.length; i++) {
			/*
			 * transverse through the second array in an inner loop comparing element of the
			 * first with second array.
			 */
			for (int j = 0; j < inputArray2.length; j++) {
				if (inputArray1[i] == inputArray2[j]) {
					System.out.println(inputArray1[i]);
					break;
				}

			}

		}

	}

}

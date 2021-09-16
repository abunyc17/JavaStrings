package com.java.string;

/**
 * @author Abu
 */

public class LengthOfString {

	public static void main(String[] args) {
		
		//How to print the length of a Java String without using the inbuild method.

		String x = "Abubakar";
		int count = 0;
		x = x.concat("\0");
		char[] y = x.toCharArray();
		int i = 0;
		while(y[i] != '\0') {
			++count;
			++i;
		}
		System.out.println(count);
		
		// printing with the inbuild function;
		//Needed to add -1 because of the concated null character "\0"
		System.out.println(x.length() - 1);
		
	}
	
	
	
			

}



package com.java.string;

/**
 * @author Abu
 */

public class LowerToUpperCaseWithSpaces {
	
	public static void main(String[] args) {
		
		//conversion to upperCase with spaces in between phrases.
		//formula for upperCase conversion: lowerCase - 32 = upperCase
		
		String x = "alaba rago market is very big";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while(i != size) {
			//check to skip empty spaces in phrase
			if(y[i] != ' ') {
				y[i] = (char) (y[i] - 32);
			}
			++i;
		}
		System.out.println(x);
		System.out.println(y);
		
	}

}



package com.java.string;

/**
 * @author Abu
 */

public class LowerToUpperFirstCharacter {
	
	public static void main(String[] args) {
		
		//Converting first character of each word in the phrase to upperCase 
		//formula for upperCase conversion: lowerCase - 32 = upperCase
		
		String x = "abunyc is a dedicated java programmer";
		
		char y[] = x.toCharArray();
		int size = y.length;
		y[0] = (char)(y[0] - 32);		
		int i = 1;
		while(i != size) {
			if(y[i] == ' ') {
				++i;
				y[i] = (char)(y[i] - 32);
				
				//other way to increment i by 1 is 
				//y[i+1] = (char)(y[i+1] - 32);
			}
			++i;
		}
		System.out.println(x);
		System.out.println(y);
		
		
	}

}



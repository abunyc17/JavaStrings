package com.java.string;

/**
 * @author Abu
 */

public class LowerToUpperCase {
	
	public static void main(String[] args) {
		
		//This code is meant to convert lowerCase to upperCase without using java default function toUpperCase();
		//formula for upperCase conversion: lowerCase - 32 = upperCase
		
		String x = "alabarago";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			
			y[i] = (char)(y[i]- 32);
			++i;
		}
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

}



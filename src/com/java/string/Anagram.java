package com.java.string;

import java.util.Arrays;

/**
 * @author Abu
 */

public class Anagram {
	
	public static void main(String[] args) {
		
		/*
		 * Anagram is a word or phrase made by transposing the letters of another word or phrase
		 * The word "secure" is an anagram of "rescue."
		 */
		String a = "SILENT";
		String b = "LISTEN";
		
		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		boolean result = Arrays.equals(x, y);
		
		if(result == true) {
			System.out.println("The String is an Anagram");
		}else {
			System.out.println("String Not an Anagram");
		}
		
	}

}



package com.java.string;

/**
 * @author Abu
 */

public class PalindromeRefined {
	
	public static void main(String[] args) {
		
		String namedString = "race car";
		
		//to remove whitespace in the phrase
		namedString = namedString.replace(" ", "");
		
		//converting all passed phrase to lowerCase
		namedString = namedString.toLowerCase();
		char[] a = namedString.toCharArray();
		int size = a.length;
		char[] b = new char[size];
		int i = 0;
		
		while(i != size) {
			b[size - 1 -i] = a[i];
			++i;
		}
		System.out.println(a);
		System.out.println(b);
		
		//************************************		
		System.out.println("*********************First method**************************");
		i = 0;
		while (i != size) {
			if(a[i] != b[i]) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}else {
				++i;
				continue;
			}
		}
		
		System.out.println("palindrome");
		
		//************************************
		System.out.println("***************Second method*****************************");
		
		String bConverted = String.valueOf(b);
		if (bConverted.equals(namedString)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
	}

}



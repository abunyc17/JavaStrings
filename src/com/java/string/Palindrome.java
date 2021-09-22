package com.java.string;

/**
 * @author Abu
 */

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Palindrome are word, phrase, or sequence that reads the same backwards as
		 * forwards, e.g madam, liril, civic
		 */

		String stringValue = "refer";

		//converting String object to character Array
		char[] x = stringValue.toCharArray();
		int size = x.length;
		char[] y = new char[size];
		int i = 0;
		while (i != size) {
			y[size - 1 - i] = x[i];
			++i;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println("");
		System.out.println("**********************First Logic******************************");
		i = 0;
		while (i != size) {
			if(x[i] != y[i]) {
				System.out.println("Not a palindrome!!!");
				System.exit(0);
			}else {
				i++;
				continue;
			}
		}
		System.out.println("It is a palindrome!!!");
		
		//############################################################################################
		
		//Note: Once it is not a palindrome the control won't get here because of the system.exit(0) command.
		
		System.out.println("");
		System.out.println("**********************Second Logic*********************************");
		
		//converting char to String
		String charToString = String.copyValueOf(y);

		if (stringValue.equals(charToString)) {
			System.out.println("this is a palindrome from second logic!");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}

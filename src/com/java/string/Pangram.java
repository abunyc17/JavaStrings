package com.java.string;

/**
 * @author Abu
 */

public class Pangram {
	
	public static void main(String[] args) {
		
		/*
		 * A pangram is a unique sentence in which every letter of the alphabet is used
		 * at least once. The name comes from the Greek root words pan, meaning “all,”
		 * E.g - The quick brown fox jumps over a lazy dog
		 */
		
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x = x.replace(" ", "");
		char[] y = x.toCharArray();
		int size = y.length;
		
		//26 character spaces
		char[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i = 0;
		while(i != size) {
			
			int index = y[i] - 65;
			a[index] = 1;
			++i;
		}
		
		i = 0;
		while(i != 26) {
			if(a[i] == 1) {
				++i;
			}else {
				System.out.println("Not a pangram");
				System.exit(0);
			}
			
		}
		
		System.out.println("It's a pangram");
				
		
	}

}



package com.java.string;

/**
 * @author Abu
 */

public class ReverseString {
	
	//Reversing the String of a Java object
	
	public static void main(String[] args) {
		
		String name = "Abubakar";
		char[] a = name.toCharArray();
		int size = a.length;
		char[] b = new char[size];
		int i = 0;
		while(i != size) {			
			b[size - 1 -i] = a[i];
			++i;
		}
		System.out.println(a);
		System.out.println(b);
		
		
	}

}



package com.java.string;

/**
 * @author Abu
 */

public class CopyStringToAnother {
	
	//copy value from one String value to another

	public static void main(String[] args) {
		String name = "Abubakar";
		char[] x = name.toCharArray();
		int size = x.length;
		char[] y = new char[size];
		int i=0;
		while(i != size) {
			 y[i] = x[i] ;
			 ++i;
		}
		System.out.println(x);
		System.out.println(y);

	}

}



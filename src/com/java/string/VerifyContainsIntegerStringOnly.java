package com.java.string;

/**
 * @author Abu
 */

public class VerifyContainsIntegerStringOnly {
	
	public static void main(String[] args) {
		
		String x = "4855477742";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			
			if(y[i] >= '0' && y[i] <= '9') {
				i++;
				
				
			}else {
				System.out.println("Not an Integer String");
				System.exit(0);
			}
			
		}
		System.out.println("Contains Integer String Only");
		
	}

}



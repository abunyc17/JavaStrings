package com.java.string;

/**
 * @author Abu
 */

public class IntegerStringEfficient {
	
	public static void main(String[] args) {
		
		//This is to check if the code block contains only integer String
		
		
		String x = "74582255";
		int size = x.length();
		
		int i = 0;
		while(i != size) {
			if(x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				++i;
				
			}else {
				System.out.println("Not an Integer String. It contains characters!");
				System.exit(0);
				
			}
				
		}
		System.out.println("Integer String only");
		
		
		
	}

}



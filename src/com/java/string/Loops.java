package com.java.string;

/**
 * @author Abu
 */

public class Loops {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50}; 
		
		int size = a.length;
		int sum = 0;
		System.out.println("*****************while loop**************************");
		//while loop	
		int i = 0;
		while(i != size) {
			sum = sum + a[i];
			++i;
		}
		System.out.println(sum);
		
		System.out.println("*****************do while loop**************************");
		//do while loop
		i = 0;
		sum = 0;
		do {
			sum = sum + a[i];
			++i;
		}while(i != size);
		System.out.println(sum);
		
		System.out.println("*****************Traditional for loop**************************");
		//Traditional for loop
		sum = 0;
		for(int j=0; j != size; j++) {
			sum = sum + a[j];
		}
		System.out.println(sum);
		
		System.out.println("*****************for each loop**************************");
		//for each loop
		
		//right side of the for each loop it's the array name
		sum = 0;
		for(int data: a) {
			sum = sum + data;
		}
		System.out.println(sum);
	}

}



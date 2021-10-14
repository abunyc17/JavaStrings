package com.java.string;

import java.util.Random;

/**
 * @author Abu
 */

public class Starter {

	public static void main(String[] args) {
		
		String [] abc = {"milto", "ekanem", "roqeeb"};
		int size = abc.length;
		
		Random random = new Random(3);
		StringBuilder sb = new StringBuilder();
		sb.append(random.nextInt());
		System.out.println(abc[random.nextInt()]);
		for(int i = 0; i < size; i++) {
			System.out.println(sb.append(abc[i]));
		}

	}

}



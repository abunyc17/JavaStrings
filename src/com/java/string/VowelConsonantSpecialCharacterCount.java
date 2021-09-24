package com.java.string;

/**
 * @author Abu
 */

public class VowelConsonantSpecialCharacterCount {
	
	public static void main(String[] args) {
		
		String x = "HelpMeWithTheVowelAndConsonant CountWith; ;-= SpecialCharactersToo'./";
		x = x.toUpperCase();
		char[] y = x.toCharArray();
		int size = y.length;
		int vowelCount = 0;
		int consonantCount = 0; 
		int specialCharCount = 0;
		int i = 0;
		
		
		while(i != size) {
			//check if it's an alphabet or not
			if(y[i] >= 'A' && y[i] <= 'Z') {
				//validation check if it is a vowel
				if(y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U' ) {
					++vowelCount;
				}else {
					++consonantCount;
				}
			}else {
				++specialCharCount;
			}
			
			i++;
			
			
		}
		System.out.println(y);
		System.out.println("vowel counts: " + vowelCount);
		System.out.println("consonant counts "+ consonantCount);
		System.out.println("Special characters "+ specialCharCount);
		
		
	}

}



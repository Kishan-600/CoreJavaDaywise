package String_Program;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		String s = new String();
		int i, vowel = 0, cons = 0;
		String total="";
		 String vowelsInString = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a string ");
		s.toUpperCase();
//									To Upper Case
		
		for (i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
						|| s.charAt(i) == 'U') {
					total=total+c+"";
					vowel++;
					
				} 
				else {
					cons++;
					vowelsInString += c + " "; 
					
				}
			}
		}
		
//		 					To Lower Case
		
//		for (i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (c != ' ') {
//			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//					|| s.charAt(i) == 'u') {
//				total=total+c+"";
//				vowel++;
//				
//			} 
//			else {
//				cons++;
//				vowelsInString += c + " "; 
//				
//			}
//		}
//	}
		
		System.out.println("total number of vowel =" + vowel);
		System.out.println(total);
		System.out.println("total number of consonant =" + cons);
		System.out.println(vowelsInString);

	}

}

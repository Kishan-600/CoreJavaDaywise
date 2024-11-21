package String_Program;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = " ";
		String str2 = " ";
		System.out.println("enter first a string ");
		str1 = sc.nextLine();
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println(str2);

//		System.out.println("enter Second a string ");
//		str2 = sc.nextLine();
//		str1=str1.toLowerCase();
//		str2=str2.toLowerCase();
//		if (str1.length() == str2.length()) {
//			char[] a=str1.toCharArray();
//			char[] b=str2.toCharArray();
//			Arrays.sort(a);
//			Arrays.sort(b);
//			boolean result=Arrays.equals(a, b);
//			if(result==true)
//				System.out.println(" String is Anagram ");
//			else
//				System.out.println(" String Not  Anagram");
//		}
//		else
//		System.out.println(" String Not  Anagram");

	}

}

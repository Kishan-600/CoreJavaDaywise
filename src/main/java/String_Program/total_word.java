package String_Program;

import java.util.Scanner;

public class total_word {

	public static void main(String[] args) {
		String s1 = new String();
		int i, count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a string ");
		s1 = sc.nextLine();
		for (i = 0; i < s1.length()-1; i++) {
			char p, q;
			p = s1.charAt(i);
			q = s1.charAt(i + 1);
			if (p == ' ' && q != ' ')
				count++;
		}
		System.out.println(count);

	}

}

package String_Program;

import java.util.Scanner;

public class Count_last_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("enter a string ");
		str = sc.nextLine();
		String rev = "";
		str = str.trim();
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ')
				count++;
			else
				break;

		}
		System.out.println("total number of last words =" + count);

	}

}

//for(int i=str.length()-1;i>=0;i--)
//{
//	rev=rev+str.charAt(i);
//}
//if(rev.toLowerCase().equalsIgnoreCase(str))
//	System.out.println(" palindrom");
//else
//	System.out.println("Not palindrom");
//
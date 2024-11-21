package String_Program;

import java.util.Scanner;

public class count_total_charater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter a string ");
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println("total number of charater = "+ count);

	}

}

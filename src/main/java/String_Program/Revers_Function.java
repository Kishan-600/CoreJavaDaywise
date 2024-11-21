package String_Program;

import java.util.Scanner;

public class Revers_Function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("enter a string ");
		s=sc.nextLine();
//		char ch[]=s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		StringBuffer aa=new StringBuffer(s);
		System.out.println(aa.reverse());

	}

}

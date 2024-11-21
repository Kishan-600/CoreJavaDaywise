package String_Program;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter a string ");
		str=sc.nextLine();
		str=str.toUpperCase();
		int a[]=new int[26];
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			int tmp=str.charAt(i)-65;
			a[tmp]=1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=1) {
				System.out.println(" string not panagram");
//			System.exit(0);
				
			}
		}
		System.out.println(" A  string panagram  ");
	}

}

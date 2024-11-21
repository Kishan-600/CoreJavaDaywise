package String_Program;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("enter a string ");
		s=sc.nextLine();
		int i=0,flag=0;
		String plan=" ";
		int j=s.length()-1;
		while(i<j && flag==0)
		{
			if(s.charAt(i)!=s.charAt(j)) {
				flag++;
				}
			i++;
			
			j--;
			
		}
		
		if(flag==0)
			System.out.println("palindrom number");
		else
			System.out.println("not palindrom number ");
		
		
//				simple method pilondrom number
		
//		System.out.println("given a string"+s);
//		for(i=s.length()-1;i>=0;i--)
//		{
//			plan=plan+s.charAt(i);
//			
//		}
//		System.out.println(" strig is revers order= "+plan);

	}
}

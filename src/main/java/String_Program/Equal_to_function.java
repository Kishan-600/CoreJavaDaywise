package String_Program;

import java.util.Scanner;

 public class Equal_to_function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		String a=new String();
		System.out.println("enter a string ");
		s=sc.nextLine(); 	
		System.out.println("enter a second string ");
		a=sc.nextLine(); 	
//		if(s.equalsIgnoreCase(a))
		if(s.compareTo(a)==0)
			System.out.println("string are equal");
		else if(s.compareTo(a)>0)
			System.out.println(" string 1 is greter than string2 ");
		else 
			System.out.println("string 2 is greter than string 1");
	
	}
}

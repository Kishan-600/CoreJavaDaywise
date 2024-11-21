package String_Program;

import java.util.Scanner;

public class Print_String {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fname=new String();
		String lname=new String();
		String aa=new String();
		System.out.println("ente your first name: ");
		fname=sc.nextLine();
		System.out.println("ente your last name: ");
		lname=sc.nextLine();
		System.out.println("ente your String name: ");
		aa=sc.nextLine();
//		length()
		System.out.println("total length of Name= "+fname+lname.length());
		System.out.println(fname+lname);
		
//		charAt()
		int len=aa.length();
		for(int i=0;i<len;i++)
			System.out.println(aa.charAt(i));
	}

}

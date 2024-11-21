package String_Program;

import java.util.Scanner;

public class Sub_String {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=new String();
			System.out.println("ente you string: ");
			s=sc.nextLine();
//			substring 
				System.out.println(s.substring(2));
//				indexof  print the index number
				System.out.println(s.indexOf('n'));
	}

}

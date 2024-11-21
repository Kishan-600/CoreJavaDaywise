package String_Program;

import java.util.Scanner;

public class Print_short_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("enter a string ");
		s=sc.nextLine();
		int i,j;
		i=s.length()-1;
		char c,d;
		while(s.charAt(i)!=' ')
		
			i--;
			j=0;
			while(j<i)
			{
				if(j==0)
				System.out.print(s.charAt(j)+".");
				else
				{
					c=s.charAt(j);
					d=s.charAt(j+1);
					if(c==' ' && d!=' ')
						System.out.print(d+".");
				}
				j++;
			}
			System.out.print(s.substring(i));
			
			
		
	}

}

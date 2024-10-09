package Patternprograming;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		       *
//		      **
//		     ***
//	    	****
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i=1,j=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
				
				
				
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
		
	}

}

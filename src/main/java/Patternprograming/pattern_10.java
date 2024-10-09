package Patternprograming;

import java.util.Scanner;

public class pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i=1,j=1;
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=n-i+1;j++)
//			{
//				System.out.print(j);
//				
//				
//			}
//			System.out.println(" ");
		
		
		for(i=n;i>=1;i--)
			{
				for(j=1;j<=i-1;j++)
				{
					System.out.print(j);
					
					
				}
				System.out.println(" ");

		
	}
	}

}

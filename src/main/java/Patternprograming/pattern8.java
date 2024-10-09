package Patternprograming;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i=1,j=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n)
				System.out.print("#");
				else 
					System.out.print(" ");
				
			}
			
			System.out.println(" ");

		
	}

	}

}

package Patternprograming;

import java.util.Scanner;

public class halfDaimond {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n number ");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
				for(k=1;k<=2*i-1;k++)
					System.out.print("*");
				System.out.println();
		}

	}

}
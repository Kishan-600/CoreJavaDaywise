package com.loopsed;

import java.util.Scanner;

public class prime1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		
		int i=1,j=1,count;
		for(i=1;i<=100;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
		
	}

}

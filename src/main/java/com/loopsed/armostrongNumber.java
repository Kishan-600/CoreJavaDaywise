package com.loopsed;

import java.util.Scanner;

public class armostrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int z,count=0,sum=0;
		z=n;
		while(z>0)
		{
			count++;
			z=z/10;
		
		}
		System.out.println("total number of digit="+count);
		
		while(z>0)
		{
			int digit=z%10,pro=1;
			for(int i=1;i<=count;i++)
				{
				pro=pro*digit;
				}
			sum=sum+pro;
			z=z/10;
		}
			if(sum==n)
				System.out.println("armostrong number");
			else
				System.out.println("not armostrong number");
	}

}

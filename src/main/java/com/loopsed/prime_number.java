package com.loopsed;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("not prime");
	}

}

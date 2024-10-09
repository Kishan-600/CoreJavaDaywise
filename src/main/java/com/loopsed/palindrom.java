package com.loopsed;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int rev=0,z;
		z=n;
		while(n>0) 
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(rev==z)
			System.out.println(" palindrom number");
		else 
			System.out.println("not palindrom number");
	}

}

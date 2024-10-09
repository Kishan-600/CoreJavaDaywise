package com.loopsed;

import java.util.Scanner;

public class factorial_nmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
			System.out.println("fact of num="+fact);
		}
	}

}

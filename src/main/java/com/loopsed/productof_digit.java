package com.loopsed;

import java.util.Scanner;

public class productof_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int pro=1;
		while(n>0)
		{
			pro=pro*n%10;
			n=n/10;
			System.out.println("product of digit="+pro);
		}

	}

}

package com.loopsed;

import java.util.Scanner;

public class sum_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int sum=0;
		int n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
			System.out.println(sum);
		}

	}

}

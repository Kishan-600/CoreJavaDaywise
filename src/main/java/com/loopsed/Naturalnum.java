package com.loopsed;

import java.util.Scanner;
public class Naturalnum {

	public static void main(String[] args) {
		
//		sum of natural num 
		
//		try (Scanner sc = new Scanner(System.in)) {
//			int n = sc.nextInt();
//			int i = 1, sum = 0;
//			while (i<=n) {
//				sum = sum + i;
//				System.out.println("total num of sum =" + sum);
//				i++;
//			}
//		}
//		
		
//		reverse number 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of n");
		int n=sc.nextInt();
		int rev=0;
		
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
			System.out.println(rev);
		
		}
		
		
		
	}
}

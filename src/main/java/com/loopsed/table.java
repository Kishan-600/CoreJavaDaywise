package com.loopsed;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i;
		
		for(i=1;i<=10;i++)
		{
			int m=n*i;
			System.out.println(m);
		}

	}

}

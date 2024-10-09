package com.loopsed;

import java.util.Scanner;

public class sumofnum_productofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int sum=0,pro=1,digit;
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0) {
				sum=sum+digit;
			System.out.println("sum of even num="+sum);
			}
			else {
				pro=pro*digit;
			System.out.println("pro of num ="+pro);
			}	
			n=n/10;
			
	}

}
}

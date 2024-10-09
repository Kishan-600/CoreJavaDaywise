package Patternprograming;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a num");
//		int n=sc.nextInt();
//		int i=1,j=1,k=1;
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(k);
//				k++;
//				System.out.print("	");
//				
//				
//			}
//			System.out.println("");
//
//		
//	}


		
//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		1 0 1 0 1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int i=1,j=1,k=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{int sum=i+j;
				if(sum%2==0)
				System.out.print("1 ");
				else
				System.out.print("0 ");
				
				
			}
			System.out.println("");
		
		
	}
	}
}

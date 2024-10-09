package Array_program;

import java.util.Scanner;

public class sum_product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n input  number ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int i=0,sum=0,pro=1;
		for(i=0;i<n;i++)
			{
			System.out.println("enter a number ");
			a[i]=sc.nextInt();
			}
				for(i=0;i<n;i++)
					{
					sum=sum+a[i];
				    pro=pro*a[i];
					}
				System.out.println(sum);
				System.out.println(pro);
	}


}
	
	
	
	
	
	
	
	
	
//	int a[]=new int[10];
//	for(int i=0;i<10;i++)
//	{
//		System.out.println("enter a number ");
//		a[i]=sc.nextInt();
//	}
//	for(int i=0;i<10;i++)
//	{
//		System.out.println(a[i]);
//	}
//}
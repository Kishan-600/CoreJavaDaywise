package Patternprograming;

import java.util.Scanner;

public class reviewof_classs {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter a number ");
//	int n=sc.nextInt();
		int n=6;
	int i=0,j=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i+j==n-1 || (i==j && i<=n/2 &&i!=n/2))
			
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.print(" ");
		
			for(j=0;j<n;j++)
			{
				if(i==0 || j==0 || j==n-1 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			System.out.print(" ");	
			for(j=0;j<n;j++)
			{
				if( j==0 || j==n-1 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			System.out.print(" ");	
			for(j=0;j<n;j++)
			{
				if( j==0 || i==0 || (j==n-1 && i<=n/2) || i==n/2 || i-j==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			
	
			
//			class 
			
			System.out.print(" 	 ");	
			for(j=0;j<n;j++)
			{
				if( j==0 || i==0 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			
			System.out.print("   ");	
			for(j=0;j<n;j++)
			{
				if( j==0 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=0 || (i==0 && j!=0 && j!=n-1) || (j==n-1 && i!=0) || i==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
		
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || (j==0 && i<=n/2) || i==n/2 || (j==n-1 && i>=n/2) || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || (j==0 && i<=n/2) || i==n/2 || (j==n-1 && i>=n/2) || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
	
			
	
			
			
//			is 
			
			
			System.out.print(" 	 ");	
			for(j=0;j<n;j++)
			{
				if( i==0 || i==n-1 || j==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || (j==0 && i<=n/2) || i==n/2 || (j==n-1 && i>=n/2) || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
		
			
			
		
			
//			enjoyable
			
			System.out.print("  	");	
			for(j=0;j<n;j++)
			{
				if( j==0 || i==n-1 || i==0|| i==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
	
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n/2 || i-j==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || j==0 || j==n-1 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i+j==n-1 || (i==j && i<=n/2 &&i!=n/2))
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=0 || (i==0 && j!=0 && j!=n-1) || (j==n-1 && i!=0) || i==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0 || j==n-1 ||  i==n-1 || i==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(j==0 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if( j==0 || i==n-1 || i==0|| i==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			
			
			
//			sir  
			
			
			System.out.print("	 ");
			for(j=0;j<n;j++)
			{
				if(i==0 || (j==0 && i<=n/2) || i==n/2 || (j==n-1 && i>=n/2) || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n/2 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			
			
			System.out.print("  ");	
			for(j=0;j<n;j++)
			{
				if( j==0 || i==0 || (j==n-1 && i<=n/2) || i==n/2 || i-j==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			
		System.out.println();
}
	}
}
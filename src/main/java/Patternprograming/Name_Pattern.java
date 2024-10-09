package Patternprograming;

//import java.util.Scanner;

public class Name_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System .in);
//		int n=sc.nextInt();
//	 	if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2 || j==n/2 || i==j || i+j==n-1 || i+j==n/2 || j-i==n/2 || i-j==n/2 || i+j==n-1+n/2)
		//A =	if((i==0 && j!=0 && j!=n-1) || (j==0 && i!=0) || (j==n-1 && i!=0) || i==n/2)
		//
		
		int n=11;
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || i+j==n/2 || i-j==n/2)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n/2 || i==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.print(" 	");
			
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
				if(j==0 || i==n/2 || j==n-1)
				
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
				if(j==0 || i==j || j==n-1)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.print("  "); 
			
		System.out.println();
	
	}
		 

	}

}

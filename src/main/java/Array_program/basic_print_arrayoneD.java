package Array_program;

import java.util.Scanner;
	public class basic_print_arrayoneD {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
	 System.out.println("enter N number ");
	 int n=sc.nextInt();
	 for(int i=0;i<=n;i++)
	 {
		 System.out.println(" enter a digit");
		 a[i]=sc.nextInt();	
	 }
	 for(int i=0;i<=n;i++)
		 System.out.println(a[i]);
	
	}

}

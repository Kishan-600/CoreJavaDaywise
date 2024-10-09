package Twod_Array;

import java.util.Scanner;

class jagged{
	int a[][]=new int[2][];
	
	void getdata() {
 		Scanner sc=new Scanner(System.in);
		a[0]=new int[3];
		a[1]=new int[5];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(" enter array digit");
				a[i][j] = sc.nextInt();
			}
	}
	
	}
	
	void putdata() {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
	}
		
		
	}
	
	
	
}

public class jagged_Array {

	public static void main(String[] args) {
		jagged aa=new jagged();
		aa.getdata();
		aa.putdata();

	}

}

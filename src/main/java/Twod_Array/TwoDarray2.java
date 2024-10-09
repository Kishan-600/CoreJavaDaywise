package Twod_Array;

import java.util.Scanner;

class method {

	int a[][] = new int[3][3];

	void getdata() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.println("enter two d array number insert");
				a[i][j] = sc.nextInt();

			}

			}
	
	void display() {
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		
	}
	}
}

public class TwoDarray2 {

	public static void main(String[] args) {
		method aa=new method();
		aa.getdata();
		aa.display();
	}

}

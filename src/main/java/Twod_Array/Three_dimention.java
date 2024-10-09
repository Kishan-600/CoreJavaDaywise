package Twod_Array;

import java.util.Scanner;

class three{
	int a[][][]=new int[2][3][3];
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
				{
				System.out.println(" enter a element of array");
				a[i][j][k]=sc.nextInt();
				}
		}
	}
	
	
	void display() {
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++)
				{
				System.out.print(a[i][j][k]);
				
				}
			
		}
			System.out.println();
		
			}
		
	}
	
}




public class Three_dimention {

	public static void main(String[] args) {
		three aa=new three();
		aa.getdata();
		aa.display();

	}

}


//
//package arrays;
//
//import java.util.Scanner;
//
//class arrayoperation3 {
//
//	int arr[][][];
//	int clg;
//	int cls;
//	int stu;
//
//	void createArray(int p,int n, int m) {
//		clg =p;
//		cls = n;
//		stu = m;
//		arr = new int[p][n][m];
//		System.out.println("array is created succesfully");
//		System.out.println("----------");
//
//	}
//
//	void addData() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("collecting array data");
//		for (int i = 0; i < cls; i++) {
//			System.out.println("inside class  no:" + (i + 1));
//			for (int j = 0; j < stu; j++) {
//				System.out.println("enter the marks of student:");
//				arr[i][j] = sc.nextInt();
//			}
//		}
//	}
//
//	void displayData() {
//		System.out.println("display a arrry data");
//		for (int i = 0; i < cls; i++) {
//			System.out.println("display inside the no:" + (i + 1) + "is =" + arr[i][i]);
//			for (int j = 0; j < stu; j++)
//				System.out.println("the marks of student no:is =" + (j + 1) + "is" + arr[i][j]);
//
//		}
//	}
//}
//
//public class Three_dimention {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the cls ");
//		int cls = sc.nextInt();
//		System.out.println("enter the stu of");
//		arrayoperation3 ao2 = new arrayoperation3();
//		int stu = sc.nextInt();
//		ao2.createArray(cls, stu);
//		ao2.addData();
//		ao2.displayData();
//
//	}
//
//}


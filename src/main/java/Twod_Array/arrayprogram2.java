package Twod_Array;

import java.util.Scanner;

class arrayoperation2 {

	int arr[][];
	int cls;
	int stu;

	void createArray(int n, int m) {
		cls = n;
		stu = m;
		arr = new int[n][m];
		System.out.println("array is created succesfully");
		System.out.println("----------");

	}

	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data");
		for (int i = 0; i < cls; i++) {
			System.out.println("inside class  no:" + (i + 1));
			for (int j = 0; j < stu; j++) {
				System.out.println("enter the marks of student:");
				arr[i][j] = sc.nextInt();
			}
		}
	}

	void displayData() {
		System.out.println("display a arrry data");
		for (int i = 0; i < cls; i++) {
			System.out.println("display inside the no:" + (i + 1) + "is =" + arr[i][i]);
			for (int j = 0; j < stu; j++)
				System.out.println("the marks of student no:is =" + (j + 1) + "is" + arr[i][j]);

		}
	}
}

public class arrayprogram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cls ");
		int cls = sc.nextInt();
		System.out.println("enter the stu of");
		arrayoperation2 ao2 = new arrayoperation2();
		int stu = sc.nextInt();
		ao2.createArray(cls, stu);
		ao2.addData();
		ao2.displayData();

	}

}

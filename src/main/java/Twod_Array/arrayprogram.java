package Twod_Array;

import java.util.Scanner;

 class arrayoperation {

	int arr[];
	int size;

	void createArray(int n) {

		size = n;
		arr = new int[size];
		System.out.println("array is created succesfully");
		System.out.println("----------");

	}

	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data");
		for (int i = 0; i < size; i++) {
			System.out.println("enter the marks of student no:" + (i + 1));
			arr[i] = sc.nextInt();
		}
	}

	void displayData() {
		System.out.println("display a arrry data");
		for (int i = 0; i < size; i++)
			System.out.println("The marks of student no:" + (i + 1) + "is =" + arr[i]);

	}

}

public class arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count of student");
		int n = sc.nextInt();
		arrayoperation ao1 = new arrayoperation();
		ao1.createArray(n);
		ao1.addData();
		ao1.displayData();
	}

}

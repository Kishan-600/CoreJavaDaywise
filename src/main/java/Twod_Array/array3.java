package Twod_Array;

import java.util.Scanner;

class arrayoperatio{

	int arr[][];
	int cls;
	Scanner sc = new Scanner(System.in);

	void createArray(int n) {

		cls = n;
		arr = new int[cls][];
		System.out.println("Enter the number of student for each of class");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the student inside the class no;" + (i + 1));
			int stu = sc.nextInt();
			arr[i] = new int[stu];
		}
		System.out.println("array is collected sucessfully");

	}

	void addData() {

		System.out.println("collecting array data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside class no :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the marks of student no:" + (j + 1));
				arr[i][j] = sc.nextInt();
			}

		}
	}

	void display() {
		System.out.println("display a arrry data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the class:" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("the marks of student n0" + (j + 1) + " is=" + arr[i][j]);
			}

		}
	}

}

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of class");
		int cls = sc.nextInt();
		arrayoperatio aa = new arrayoperatio();
		aa.createArray(cls);
		aa.addData();
		aa.display();
	}

}
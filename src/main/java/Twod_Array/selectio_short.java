package Twod_Array;

import java.util.Scanner;

class shorting {
	int a[] = new int[5];

	void getdata() {

		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number ");
			a[i] = sc.nextInt();
		}
	}

	void takedata() {

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

	void display() {
		int i, j, t;
		for (i = 0; i < 4; i++)
			for (j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
	}
}

public class selectio_short {

	public static void main(String[] args) {

		shorting aa = new shorting();
		aa.getdata();
		System.out.println("Unsorted data here are");
		aa.takedata();
		System.out.println("full sorted in asending order data here !!");
		aa.display();
		aa.takedata();
	}

}

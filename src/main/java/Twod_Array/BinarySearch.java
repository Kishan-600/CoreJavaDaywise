package Twod_Array;

import java.util.Scanner;

class Binary {

	int a[] = new int[10];
	int key;

	void getdata() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("enter all digit of array");
			a[i] = sc.nextInt();
		}
		System.out.println("enter key number");
		key = sc.nextInt();

	}

	void search() {
		int i = 0, j = 9, mid, flag = 0, pos;
		while (i <= j && flag == 0) {
			mid = i + j / 2;
			if (a[mid] == key) {
				flag++;
				pos=mid+1;
				System.out.println("the postion of key n0="+pos);
			}
			if (a[mid]>key)
				j=mid-1;
			if (a[mid]<key) 
				i=mid-1;
	
		}

		if (flag == 1)
			System.out.println(" the number is linear");
		else
			System.out.println(" the numberis Non linear");
	}

}

public class BinarySearch {

	public static void main(String[] args) {
		Binary aa=new Binary();
		aa.getdata();
		aa.search();
	}

}

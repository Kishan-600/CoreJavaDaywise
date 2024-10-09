package Twod_Array;

import java.util.Scanner;

class linear {

	int a[] = new int[10];
	int key;

	void getdata() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("enter all digit of array");
			a[i] = sc.nextInt();
		}
		System.out.println("enter key number");
		key = sc.nextInt();

	}

	void search() {
		int flag=0,position;
		for(int i=0;i<5&&flag==0;i++) {
			if(a[i]==key)
			{
				flag=1;
				position=(i+1);
			}
		}
		
		if(flag==1)
			System.out.println(" the number is linear");
		else
			System.out.println(" the numberis Non linear");
	}
	
}

public class linearSearch {

	public static void main(String[] args) {

		linear aa=new linear();
		aa.getdata();
		aa.search();
	}

}

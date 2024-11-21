package Oop.Static_variable;

import java.util.Scanner;

class m {
	int a, b;

	void getdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  :");
		a = sc.nextInt();
		System.out.println("enter a number  :");
		b = sc.nextInt();
	}
}
	class n extends m {
		int c;

		void setdata() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number  :");
			c = sc.nextInt();
		}
	}
		class p extends n {
			int d;

			void display() {
				d = a + b + c;
				System.out.println(" added on three number= " + d);
			}
		}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		p obj = new p();
		obj.getdata();
		obj.setdata();
		obj.display();
	}

}

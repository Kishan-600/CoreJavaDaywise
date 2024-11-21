package Oop.Static_variable;

import java.util.Scanner;

class Xx {
	int a;

	void getdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  :");
		a = sc.nextInt();

	}
}

class y extends Xx {
	int b;

	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  :");
		b = sc.nextInt();
	}
}

class z extends y {
	int c;

	void add() {
		c = a + b;
		System.out.println(" sum of two number =" + c);
	}
}

class Mm extends y {
	int xx;

	void mul() {
		xx = a * b;
		System.out.println("multiply of two number=" + xx);
	}

}

public class hybrid_inheritance {
	public static void main(String[] args) {
		z aa = new z();
		aa.getdata();
		aa.display();
		aa.add();
		System.out.println("===============");
		Mm b = new Mm();
		b.getdata();
		b.display();
		b.mul();
	}

}

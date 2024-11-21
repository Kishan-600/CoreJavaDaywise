package Oop.Static_variable;

import java.util.Scanner;

class d{
	int a, b;

	void getdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  :");
		a = sc.nextInt();
		System.out.println("enter a number  :");
		b = sc.nextInt();
	}
}
	class e extends d {
		int c;
		void display() {
			c=a+b;
			System.out.println("sum of two numer= "+c);
		}
	}
	
	class x extends d{
		int y;
		void opp() {
			y=a*b;
			System.out.println("multipiction of two nuber+="+y);
		}
	}

public class Hirechical_Inheritance {

	public static void main(String[] args) {
		e c=new e();
		c.getdata();
		c.display();
		
		x b=new x();
		b.getdata();
		b.opp();
		

	}

}

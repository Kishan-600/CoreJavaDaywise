package Oop.Static_variable;

import java.util.Scanner;

class a{
	int a,b;
	void getdata(){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number  :");
	a=sc.nextInt();
	System.out.println("enter a number  :");
	b=sc.nextInt();
	}
	void disdat() {
		System.out.println("add of two number="+(a+b));
	}
}
class b extends a{
	int c;
	void putdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number  :");
		c=sc.nextInt();
	}
	void output() {
		System.out.println(" add three number +="+(a+b+c));
	}
}

public class Single_Inherit {

	public static void main(String[] args) {
		b aa=new b();
		aa.getdata();
		aa.disdat();
		aa.putdata();
		aa.output();

	}

}

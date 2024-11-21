package Oop.Static_variable;

import java.util.Scanner;

class dff{
	int a;
	int b;
	dff(int x,int y){
		a=x;
		b=y;
	}
	void output(){
		int c;
		c=a+b;
		System.out.println(" total numer of sum="+c);
	}

	
}

public class Parametarised_Consturture {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(" enter a nuner ");
		int m=input.nextInt();
		System.out.println(" enter a nuner ");
		int n=input.nextInt();
		dff aa=new dff(m,n);
		aa.output();
		

	}

}
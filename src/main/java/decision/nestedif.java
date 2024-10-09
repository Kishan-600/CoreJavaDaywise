package decision;
import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number of year");
	int year=sc.nextInt();
	if(year%100==0)
	{
		if(year%400==0)
		System.out.println("leap year");
		else
			System.out.println("not a leep year");
		
	}
	else {
		if(year%4==0)
			System.out.println("leap year");	
		else
			System.out.println("not a leep year");
	}
	}

	}
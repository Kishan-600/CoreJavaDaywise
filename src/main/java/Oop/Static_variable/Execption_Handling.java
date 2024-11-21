package Oop.Static_variable;

public class Execption_Handling {

	public static void main(String[] args) {
		int x,y,a=10,b=5,c=5;
		try {
			 x=a/(b-c);
					
		}
		catch(ArithmeticException e){
			System.out.println(" divided by 0 number ");
	}
		 y=a/(b/c);
		System.out.println("y="+y);
	 
	}
}

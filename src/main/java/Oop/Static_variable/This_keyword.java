package Oop.Static_variable;

class lan {

	lan() {
		System.out.println(" this is call by defalt constructor with this()");
//		this(10);
	}

	lan(int a) {
		this();
		System.out.println(a);
	}


	
}

public class This_keyword {

	public static void main(String[] args) {
		lan b = new lan(10);
	}

}

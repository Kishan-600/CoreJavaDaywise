package Oop.Static_variable;

class defalt {
	int a;
	int b;

	defalt() {
		a = 7;
		b = 03;
		
	}
	void output() {
		System.out.println(" int number = "+a+ " " +b );
	}

}

public class Constructor {

	public static void main(String[] args) {
		defalt aa=new defalt(); 
		aa.output();
	}

}

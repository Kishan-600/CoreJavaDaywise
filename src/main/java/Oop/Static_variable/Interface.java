package Oop.Static_variable;

interface area {
	static final float pi = 3.14f;

	float calculate(float a, float b);
}

class rectangle implements area {
	public float calculate(float a, float b) {
		return a * b;
	}
}

class circle implements area {
	 public float calculate(float a, float b) {
		return pi * a * b;
	}
}

public class Interface {

	public static void main(String[] args) {
		rectangle rec = new rectangle();
		circle cr = new circle();
		area a;  // object of interface created 
		a = rec;  // reference of rectangle rec assigned in object of interface a
		System.out.println(" area of rectangle is =" + a.calculate(10, 10));
		a = cr;
		System.out.println(" area of circle is =" + a.calculate(10, 0));
	}

}

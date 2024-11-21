package Oop.Static_variable;

class m1{
	void sum(){
		System.out.println(" hii everyone my self-----");
	}
	
	void sum(int b){
		System.out.println(" hii this is second methodOverloading -----");
	}
	
}
public class Complie_Time_polymorohism {

	public static void main(String[] args) {
		m1 a=new m1();
		a.sum(56);
		a.sum();
		

	}

}

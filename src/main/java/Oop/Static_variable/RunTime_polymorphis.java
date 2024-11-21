package Oop.Static_variable;

class opp {
	void mm1() {
		System.out.println(" this parante class calling you by runtime");
	}
}

class chld extends opp {
	@Override
	void mm1() {
		super.mm1();
		System.out.println(" chid class here miss/mrs");
	}
}

public class RunTime_polymorphis {

	public static void main(String[] args) {
		opp a=new chld();
		a.mm1();

	}

}

package Oop.Static_variable;

class boby{
	int roll;
	String name;
	static String cname=" shree ram ug";
	
	boby(int x,String y){
		roll=x;
		name =y;
	}
	void dispaly() {
		System.out.println(roll +"/t"+ name + cname);
	}
	

}


public class Static_variable {

	public static void main(String[] args) {
		boby aa=new boby(101, "kishan");		
		boby a=new boby(103, "sahnu han");
		aa.dispaly();
		a.dispaly();
		
	}

}

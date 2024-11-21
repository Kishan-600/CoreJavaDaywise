package Oop.Static_variable;

class boss{
	int roll;
	String name;
	static String cname=" shree ram ug";
	
	boss(int x,String y){
		roll=x;
		name=y;
	}
	
	
	void dispaly() {
		System.out.println(roll + name + cname);
	}
	static void setname() {
		cname="ram dev pg";
	
	}

}


    class Static_method{

	public static void main(String[] args) {
		boss aa=new boss(101, "kishan");		
		boss a=new boss(103, "sahnu han");
		aa.dispaly();
		a.dispaly();
		boss.setname();
		aa.dispaly();
		a.dispaly();
		
		
	}

} 
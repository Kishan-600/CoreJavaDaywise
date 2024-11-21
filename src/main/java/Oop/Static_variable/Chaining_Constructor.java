package Oop.Static_variable;

 class tab{
	tab(){
		this(8);
		System.out.println(" this is defalt parante class");
	}
	tab(int a){
		this("kishan");
		System.out.println(" this is parante class parameter = "+a);
	}
	tab(String name){
		
		System.out.println(" this is defalt parante class= " +name);
	}
}
 class lab extends tab{
	
	lab()
	{
		this(10);
		System.out.println("defalt construtor");
	}
	lab(int a)
	{
		this("shanu");
		System.out.println("single parameter passs=="+a);
	}
	lab(String name)
	{
		super();
		System.out.println("fina construcer call=="+name);
	}
	
}


public class Chaining_Constructor {

	public static void main(String[] args) {
		lab a=new lab();

	}

}

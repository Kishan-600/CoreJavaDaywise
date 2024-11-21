package String_Program;

public class Replace_function {

	public static void main(String[] args) {
		
		        String s = "this is budy";
		        System.out.println(s.replace("is", "was"));
		        System.out.println(s.replaceFirst("is", "was"));
		        System.out.println(s.replaceAll("is", "was"));
		        System.out.println(s.replaceAll("is(.)", "was"));
		        System.out.println(s.replaceAll("is(.*)", "was"));
	}

}

package Operator;

public class ternary_operator {

	public static void main(String[] args) {
		int a=2,b=4,c=5;
		int max=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println("graetr than a ,b & c= "+(max));
	}

}

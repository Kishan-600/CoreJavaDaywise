package decision;
import java.util.Scanner;

public class ladderelse {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float eng=sc.nextFloat();
			float hindi=sc.nextFloat();
			float math=sc.nextFloat();
			float sis=sc.nextFloat();
			float sum;
			sum=eng+hindi+math+sis;
			System.out.println(sum);
			System.out.println(sis);
//			double percentage=(sum/400.0)*100;
//			System.out.println(percentage);
			
//		grading by ladder
			
//			if(percentage>90)
//				System.out.println("a grade");
//			else if(percentage>=80&&percentage<90)
//				System.out.println("b grade");
//			else if(percentage>=70&&percentage<80)
//				System.out.println("c grade");
//			else if(percentage>=60&&percentage<70)
//				System.out.println("d grade");
//			else
//				System.out.println("e grade");
		}
		
		
	}
}

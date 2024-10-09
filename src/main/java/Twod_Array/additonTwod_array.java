package Twod_Array;
import java.util.Scanner;

class methoded {

	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];

	void getdata() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("enter two d array number insert A matrix");
				a[i][j] = sc.nextInt();
			}
		}
	
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println("enter two d array number insert B matrix");
			b[i][j] = sc.nextInt();
		}
	}
	}
	
	
	void addd() {
		
	for (int i = 0; i < 3; i++) 
		for (int j = 0; j < 3; j++) 
			c[i][j] = a[i][j]+b[i][j];
			}
	
		void display() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(c[i][j]+"   ");
				}	
					System.out.println();
			}
		}
	
}


public class additonTwod_array {

	public static void main(String[] args) {
		methoded aa=new methoded();
		aa.getdata();
		aa.addd();
		aa.display();

	}

}

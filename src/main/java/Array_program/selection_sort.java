package Array_program;

import java.util.Scanner;

class shorts{
	int a[]=new int[5];
	
	 void getdata() {
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++) {
			 System.out.println("enter a digit in array");
			a[i]=sc.nextInt();
		 }
	 }
	 
	 void dispaly()
	 {
		 for(int i=0;i<5;i++)
			 System.out.println(a[i]);
	 }
	 
	 
	 void sort() {
		 int i,j,t;
		 for(i=0;i<4;i++)
		for(j=i+1;j<5;j++)
		 {
			 if(a[i]>a[j])
			 {
				 t=a[i];
				 a[i]=a[j];
				 a[j]=t;
			 }
		 }
}
	 
	
}
public class selection_sort {

	public static void main(String[] args) {
		shorts aa=new shorts();
		aa.getdata();
		System.out.println(" unsorted array ");
		aa.dispaly();
		System.out.println("sorted array ");
		aa.sort();
		aa.dispaly();
		
		
		
	}

}

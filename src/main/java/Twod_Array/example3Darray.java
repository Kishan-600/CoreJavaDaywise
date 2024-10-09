package Twod_Array;

class array3d{
	 int a[][][]=new int[1][4][5];
	 int val=0;
	 void getdata()
	 {
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 for(int k=0;k<a[i][j].length;k++) {
					 a[i][j][k]=val;
					 val++;
				 }
			 }
		 }
	 }
	 
	 void display()
	 {
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 for(int k=0;k<a[i][j].length;k++) {
					 System.out.print(a[i][j][k]+"\t");
				 }
				 System.out.println();
			 }
			 System.out.println();
		 }
	 }
	 
	
	
	
}




public class example3Darray {

	public static void main(String[] args) {
		 array3d aa=new  array3d();
		 aa.getdata();
		 aa.display();
	}

}

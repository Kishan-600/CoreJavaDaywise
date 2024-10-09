package demo;
//
//public class second {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=5;
//		int i=1,j=1,sum=0;
//		for(i=1;i<=n;i++) {
//			for(j=1;j<=n;j++)
//			{
//       
//				if(i%2==0)
//					System.out.print("0");
//				else 
//					System.out.print("1");
//				
//			}
//	
//		System.out.println();
//	
//	
//		
//	}}
//
//}

//package Patternprograming;

public class second {

    public static void main(String[] args) {
        int n = 6;
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            // First pattern
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 || (i == j && i <= n / 2 && i != n / 2))
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Second pattern
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Third pattern
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Fourth pattern
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || (j == n - 1 && i <= n / 2) || i == n / 2 || i - j == n / 2)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Fifth pattern
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Sixth pattern
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Seventh pattern
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 || (i == 0 && j != 0 && j != n - 1) || (j == n - 1 && i != 0) || i == n / 2)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Eighth pattern
            for (int j = 0; j < n; j++) {
                if (i == 0 || (j == 0 && i <= n / 2) || i == n / 2 || (j == n - 1 && i >= n / 2) || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Ninth pattern
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // Tenth pattern
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1)
                    output.append("* ");
                else
                    output.append("  ");
            }
            output.append(" ");

            // End of line
            output.append("\n");
        }
        
        // Print the entire output at once
        System.out.print(output.toString());
    }
}

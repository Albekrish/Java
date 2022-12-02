package set1;

import java.util.Scanner;

/*
) Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
   4 5 6
 7 8 9 10

*/
public class Pattern56 {
	

	public static void main(String[] args) {
		/*
		 * System.out.print("Height of C: "); Scanner sc = new Scanner(System.in); int
		 * height = sc.nextInt();
		 */
		
		int height=4;
		int temp=1;
		for (int i = 1; i <= height; i++)
	    {
	       for(int j=i;j<height;j++) {
	    	  System.out.print(" ");
	        }
	       for(int j=1;j<=i;j++) {
	    	   System.out.print(temp+" ");
	    	   temp++;
	       }
	        System.out.println();
	    }

	}

}

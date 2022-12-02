package set1;

import java.util.Scanner;

/*
Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
****
*/
public class Pattern55 {
	

	public static void main(String[] args) {
		/*
		 * System.out.print("Height of C: "); Scanner sc = new Scanner(System.in); int
		 * height = sc.nextInt();
		 */
		
		int height=4;
		for (int i = 1; i <= height; i++)
	    {
	       for(int j=1;j<=height;j++) {
	    	   if(i==1 || i==height || j==1) {
	    		   System.out.print("*");
	    	   }
	    	   else {
	    		   System.out.print("");
	    	   }
	        }
	        System.out.println();
	    }

	}

}

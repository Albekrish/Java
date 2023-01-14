package set1;

import java.util.Scanner;

/*
58) Write a program to print the following pattern 
		         9
		       8 9 8
		     7 8 9 8 7
		   6 7 8 9 8 7 6
	     5 6 7 8 9 8 7 6 5
	   4 5 6 7 8 9 8 7 6 5 4
     3 4 5 6 7 8 9 8 7 6 5 4 3
   2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
public class Pattern48 {
	

	public static void main(String[] args) {		
		int n=9;
		int temp=n;
		for (int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(n-j+1+" ");				
				
			}
			for(int j=2;j<=i;j++) {     //to maintain no.
				System.out.print(n-j+1+" ");
				
			}
			//or
			/*
			 * for(int j=i;j>1;j--) { System.out.print(n+2-j+" "); }
			 */
		 System.out.println(" ");		
		
		}
		
		

	}

}

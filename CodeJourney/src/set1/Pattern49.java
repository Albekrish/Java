package set1;

import java.util.Scanner;

/*
58) Write a program to print the following pattern 
  * * * * * * * * * *
   * * * * * * * * *
    * * * * * * * *
     * * * * * * *
      * * * * * *
       * * * * *
        * * * *
         * * *
          * *
           *
*/
public class Pattern49 {
	

	public static void main(String[] args) {
		//System.out.print("Rows of inverted pyramid: ");
       // Scanner sc = new Scanner(System.in);
        int n = 10;      
       
        for (int i = 1; i <= n ; i++) 
		{ 
			for (int j = 1; j < i; j++) 
			{ 
				System.out.print(" "); 
			} 
			for (int j=i;j<=n;j++) 
			{ 
				System.out.print("* "); 
			} 
			
			System.out.println(); 
		}



		
		

	}

}

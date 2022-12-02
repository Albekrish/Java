package set1;

import java.util.Scanner;

/*
58) Write a program to print the following pattern for the given input number.
Eg 1:  Input: 4
        Output:
********
***__***
**____**
*______*
**____**
***__***
********
*/
public class Pattern58 {
	

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	      // System.out.print("Enter the Size: ");
	      // int n = sc.nextInt();  //4
	       int n=4;
	       int i,j;
	       
	       for (i = 1; i <=n; i++) 
	       {
	           for (j = i; j <=n ; j++) 
	           {
	        	   System.out.print("*");
	           }
	           for (int k=1;k<i;k++) {
	        	   System.out.print(" ");
	           }
	           for (j = 1; j <i ; j++) 
	           {
	        	   System.out.print(" ");
	           }
	           for (int k=i;k<=n;k++) {
	        	   System.out.print("*");
	           }
	           System.out.println("");
	       }

	      
	      for (i = 2; i <= n; i++) 
	       {
	           for (j = 1; j <=i; j++) 
	           {
	            System.out.print("*");   
	           }
	           for (j = i; j <n; j++) 
	           {
	            System.out.print(" ");   
	           }
	           for (j = i; j <n; j++) 
	           {
	            System.out.print(" ");   
	           }
	           for (j = 1; j <=i; j++) 
	           {
	            System.out.print("*");   
	           }
	            
	           System.out.println("");
	       } 

	}

}

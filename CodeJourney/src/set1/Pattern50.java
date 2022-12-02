package set1;

import java.util.Scanner;

/*
58) Write a program to print the following pattern 
 9 9 9 9 9 9 9 9 9 
  8 8 8 8 8 8 8 8 
   7 7 7 7 7 7 7 
    6 6 6 6 6 6 
     5 5 5 5 5 
      4 4 4 4 
       3 3 3 
        2 2 
         1 

*/
public class Pattern50 {
	

	public static void main(String[] args) {		
		int n=9;
		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(n+1-i +" ");
			}
		System.out.println("");		
		
		}
		
		

	}

}

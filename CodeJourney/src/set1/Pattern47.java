package set1;

import java.util.Scanner;

/*
58) Write a program to print the following pattern 
		   
                  1  
                1 2 1  
              1 2 3 2 1  
            1 2 3 4 3 2 1  
          1 2 3 4 5 4 3 2 1  
        1 2 3 4 5 6 5 4 3 2 1  
      1 2 3 4 5 6 7 6 5 4 3 2 1  
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1  
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1  

*/
public class Pattern47 {
	

	public static void main(String[] args) {		
		int n=9;
		//int temp=n;
		for (int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			for(int j=i;j>1;j--) {     //to maintain no.
				System.out.print(j-1+" ");
				
			}
		 System.out.println(" ");		
		
		}
		
		

	}

}

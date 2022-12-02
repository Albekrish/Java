package set1;

import java.util.Scanner;

/*
Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1:  Input: 12345
        Output:
1       5
  2   4
    3
  2   4
1        5

*/
public class Pattern57 {
	

	public static void main(String[] args) {
		//String s="12345";
		String s= "geeksforgeeks";
		int n=s.length();
		
		for (int i = 1; i <= n; i++)
	    {
			for (int j = 1; j <= n; j++) {
				if(i==j) {
					System.out.print(s.charAt(i-1)); //char start from 0 so, sub to make it 0
				}else if(i+j == n+1) {
					System.out.print(s.charAt(n-i));
				}
				else {
					System.out.print(" ");
				}
			}
	        System.out.println();
	    }

	}

}

package set1;

/*
 * 
 * Write a program to print the following output for the given input. You can assume the
string is of odd length
Eg 1:  Input: 12345
        Output:
1       1
  2   2
    3
  4   4
5        5

*/
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		String s="12345";
		//String s= "geeksforgeeks";
		int n=s.length();
		
		for (int i = 1; i <= n; i++)
	    {
			for (int j = 1; j <= n; j++) {
				if(i==j || i+j == n+1) {
					System.out.print(s.charAt(i-1)); //char start from 0 so, sub to make it 0
				}else {
					System.out.print(" ");
				}
			}
	        System.out.println();
	    }



	}

}

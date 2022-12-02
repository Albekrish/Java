package set1;

/*Write a program to print the following pattern based on the alphabet.
Example 1:
Input: E
Output:
EEEEE
DDDD
CCC
BB
A
*/
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
				
		char c='C';
		int n= c-64;		
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {				;
				System.out.print(c);				
			}
			c--;
			System.out.println();
		}
		
	}

}

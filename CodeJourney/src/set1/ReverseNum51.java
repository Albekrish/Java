package set1;

import java.util.Scanner;

/*Write a program to display the number in reverse order without use of String
functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321*/

public class ReverseNum51 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		int n=12345;
		// To find reverse
		int res=0,rem=0;
		while(n>0) {
			rem= n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		
		System.out.println(res);

	}

}

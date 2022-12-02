/*12.Find the GCD of two numbers and find the sum of digits of a given
number. For finding GCD of two numbers we will first find the minimum of the
two numbers and then find the highest common factor of that minimum
which is also the factor of the other number.
GCD and HCF both are same
*/

package pack;

import java.util.Scanner;

public class NumberGCD12 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the two numbers:");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		
		//Find the smallest no. using ternary to find the GCD easily
		int a=45;
		int b=30;
		
		int min= a<b?a:b; //or Math.min(a,b);
		
		 while(min>=2)  
		 {		
			if((a%min==0) && (b%min==0)) 
			{
			 break;
			}
			min--;
		 }
		 
		System.out.println("GCD:"+min);
		
		// sum of the digit
		
		//while(t)
	}

}

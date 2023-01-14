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
		
		/*
		 * while(min>=2) { if((a%min==0) && (b%min==0)) { break; } min--; }
		 * 
		 * System.out.println("GCD:"+min);
		 * 
		 * // sum of the digit
		 * 
		 * //while(t)
		 */	
		int a=45;
		int b=30;
		int comm=0;
		int c= a<b?a:b; //or Math.min(a,b);
	
		for(int i=c;i>=2;i--) {
			if((a%i == 0) && (b%i == 0)) {
				comm=i;
				break;
			}			
		}
		System.out.println(comm);
		
		//Sum of digit
		int n=a, sum=0;
		while(n>0) {
			int rem=n%10;
			sum += rem;
			n=n/10;
		}
		System.out.println(sum);

}
}

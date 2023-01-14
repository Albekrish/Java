/*14. Write a program to get the sum of even numbers and odd number in an
array.
get the n element as a input, then find the ODD and EVEN numbers kept in
array and find the sum of the array elements.*/
package pack;

import java.util.Scanner;

public class EvenOddSumArray14 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the array size:"); int n=sc.nextInt(); int a[]=new
		 * int[n];
		 */
		int n=4;
		int[] a= {1,2,3,4}; //{even,odd,even,odd}
		int even=0,odd=0;
		int even1=0,odd1=0;
		
	//	System.out.println("Enter the array elements:");
	/*
	 * for(int i=0;i<n;i++) { a[i]= sc.nextInt(); }
	 */
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				even+=a[i];
			else
				odd+=a[i];	
			
			if(i%2==0)
				even1+=a[i];
			else
				odd1+=a[i];
		}
		
		System.out.println("Sum of even no.:"+even);
		System.out.println("Sum of odd no.:"+odd);
		
		System.out.println("Sum of even position.:"+even1);
		System.out.println("Sum of odd position.:"+odd1);
	}

}

/*Check if a given number is palindrome or not. A simple method for this 
problem is to first reverse the input, then compare the reverse with 
original. If both are same, then return true, else false.
*/

package pack;

import java.util.Scanner;

public class Palindrom11 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the no:");		
		//int n=sc.nextInt();
		
		//Method 1: number
		int n=121;
		int num=n;
		int rev=0;
		//Find reverse
		while(n>0) {
			int rem = n%10;
			rev= rev*10 + rem;
			n=n/10;
		}
       System.out.println(rev);
       
       if(num == rev)
    	   System.out.println(true);
       else
    	   System.out.println(false);
       
       
       //Method2: string
       
       String str="abcba";
       String revStr="";
       for(int i=str.length()-1;i>=0;i--) {
    	  revStr += str.charAt(i);
       }
       System.out.println(revStr);
       if(str.equals(revStr)) 
    	   System.out.println(true);
       else
    	   System.out.println(false);
	}

}

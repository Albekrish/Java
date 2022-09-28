package Leetcode;

import java.util.Scanner;

/*Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.*/

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println(isPalindrome(x));
		
		
	}
	public static boolean isPalindrome(int x) {
	     if(x<0){
	         return false;
	      }
	      int num=x; 
	      int rev=0;	      
	      while(x>0) {
	    	  rev= rev*10+ x%10;
	    	  x=x/10;
	      }
	       if(num == rev){
	          return true;
	       }else{
	          return false;
	       }

	}

}

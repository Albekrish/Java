package set1;

import java.util.Scanner;

/*59) Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1*/

public class StringIndex59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1= sc.next();
		String s2=sc.next();
		//Method 1:
		
		  if(s1.contains(s2)) { System.out.println(s1.indexOf(s2)); } else {
		  System.out.println(-1); }
		 
		
		//Method 2: without library fun
		int j=0, count=0;
		for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					j++;
				}else {
					j=0;
				}
				if(j==s2.length()) {
					j=0;
					System.out.println("The occurance at index:"+(i-s2.length()+1));
					count++;
				}
			}
		System.out.println("the number of occurance:"+count);
		}
	}



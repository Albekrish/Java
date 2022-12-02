/*Write a Program to Replace Multiple Characters in a String.
Get a string as a input and replace multiple characters from the original string,
Ex: Input:- Graduate study (replace 'a' with 'b')*/

package pack;

import java.util.Scanner;

public class ReplaceCharString17 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter the sentence:");
		//String str=sc.next();
		
		String str="Graduate study";
		
		String replaceStr=str.replace('a','b');
		System.out.println("After replacing:"+ replaceStr);
		
		System.out.println(str.replaceAll("(.*)study(.*)", "book"));

		System.out.println(str.replaceFirst("study", "learn"));
	}

}

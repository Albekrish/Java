/*16. Write a program for Split a String into a Number of Substrings. Get a
string as a input and then split as a substring
Ex : input:- Graduate study
Output :- Graduate
Study*/

package pack;

import java.util.Arrays;

public class SplitString16 {

	public static void main(String[] args) {
		
		String str="Graduate Study";
		
		String[] st=str.split(" ");
		
			
		//remove white space
		for(String s:st) {
			System.out.println(s);
		}
		String res=str.replaceAll("\\s+", "");
		System.out.println(res);
		
		recStr(res);
		
			
		}
	//recursion reverese
		public static void recStr(String s) {
			
			if(s==null || s.length()<=1) {
			System.out.print(s);	
			}else {
			System.out.print(s.charAt(s.length()-1));
			recStr(s.substring(0, s.length()-1));
			}
		
	}	
    
}

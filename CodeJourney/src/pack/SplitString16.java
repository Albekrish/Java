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
		//String s= str.replaceAll("\\s+", "");
		//System.out.println(s);
		String[] arrofstr= str.split(" ");
		
		for(String st: arrofstr)
			System.out.println(st);
		
	}	
    
}

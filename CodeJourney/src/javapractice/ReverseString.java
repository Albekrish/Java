package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
		String s = "GEEKS FOR GEEKS";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
		//Method 1
		Set <Character> hs= new LinkedHashSet<>();
		StringBuilder st= new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {			
			if(hs.add(s.charAt(i))) {
				st.append(s.charAt(i));
			}
		}	
		
		System.out.println(st.toString());		
		
		 //Method 2
	       int n=s.length();
	       String str="";
	       for(int i=n-1;i>=0;i--){
	           char c=s.charAt(i);
	           str= str+c;
	       }
	       System.out.println(str); 
		
	}
	

}

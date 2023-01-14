package set2;

import java.util.Arrays;

//Java program to find a character in a given string using binary search
public class StringLinearSearch96 {

	public static void main(String[] args) {
		String s= "Hello";
		
		char key='e';
		//Method1: using for with break
		
		  int i=0; 
		  for(;i<s.length();i++) { 
			  if(s.charAt(i)== key) {
				  System.out.println(i); 
				  break; 
			   } 
		  } 
		  if(i==s.length()) {
			  System.out.println("Not found"); 
		  }
		 
		
		//Method2: using recursion
		int start=0;
		int last=s.length()-1;
		int out= linearRecursion(s, key,start,last);
		System.out.println(out);
	}
	public static int linearRecursion(String s,char key,int start,int last){
		
		if(start>last) {
			return -1;
		}
		if(s.charAt(start)==key) {
			return start;
		}
		
		return linearRecursion(s,key, start+1,last);
		
	}

}


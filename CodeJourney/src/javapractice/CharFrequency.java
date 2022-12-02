package javapractice;

import java.util.Arrays;

public class CharFrequency {

	public static void main(String[] args) {
		String s= "geeksforgeeks";
		//o/p : g2 e4 k2 s2 f1 o1 r1 
		
		//Method 1: using Java8 Stream API
		
		long g= s.chars().filter(e -> (char)e == 'g').count();
		//System.out.println(g);
		
		//Method2: 
		
		int[] res= new int[26];  //A=65 --Z=90    a=97 -z=122
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >='A' && s.charAt(i)<='Z') {
				res[s.charAt(i)-'A']++;
			}
			if(s.charAt(i) >='a' && s.charAt(i)<='z') {
				res[s.charAt(i)-'a']++;
			}
		}
		for(int i=0;i<res.length;i++) {
			if(res[i]>0) {
				System.out.println((char)(i+'A')+"-"+res[i]);
			}
		}
		
	}
//Conver chat to int => int a = Integer.parseInt(String.valueOf(char));
	// or
	//Character.getNumericValue(char);
}

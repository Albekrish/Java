package set2;

import java.util.Arrays;

//Java Program to sort the characters in a word in descending using recursion
public class CharDecRecursion93 {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		char[] ch=s.toCharArray();
		int n=ch.length;
		
		//Method1: using recursion
		System.out.println(descend(ch,n));		
		
		//Method2: using loop
		char[] c=s.toCharArray();
		Arrays.sort(c);
		String str="";
		for(char i:c) {
			str+= i;
		}
		
		String out=reverse(str);
		System.out.println(out);
	}
	public static char[] descend(char[] cha,int n) {
		if(n<=1) {
			return cha;
		}
		for(int i=0;i<n-1;i++) {			
			if(cha[i]<cha[i+1]) {    //[s, s, r, o, k, k, g, g, f, e, e, e, e]
				char temp=cha[i];
				cha[i]=cha[i+1];
				cha[i+1]=temp;
			}
		}
		return descend(cha,n-1);  //1st last char is fixed & to fix remining n-1 char calling recursion
	}
	
	public static String reverse(String str) {
		if(str.length()<=1) {
			return str;
		}
		
		return reverse(str.substring(1))+str.charAt(0);
	}
}

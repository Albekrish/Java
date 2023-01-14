package set2;

import java.util.Arrays;

//Java Program to sort the words in ascending using recursion
public class StringSortAscRecur92 {

	public static void main(String[] args) {
		
		String[] s={"Joe","Sam","Ani"};
		int n=s.length;
		String[] result= stringRec(s,n);
		System.out.println(Arrays.toString(result));
	
		
	}
	public static String[] stringRec(String[] s, int n) {
		if(n<=0) {
			return s;
		}
		for(int i=0;i<n-1;i++) {
			if(s[i].compareTo(s[i+1])>0){
				String temp=s[i];
				s[i]=s[i+1];
				s[i+1]=temp;
			}
		}
		return stringRec(s, n-1);
	}
}

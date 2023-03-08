package com.mentor.practice2;

import java.util.Arrays;
import java.util.Stack;

//Decoding:
//IIDDIDID  ——>  125437698
//IDIDII    ——>  1325467
//DDDD      ——>  54321
//IIII      ——>  12345
public class SequenceDecode2 {

	public static void main(String[] args) {
		String s = "IIDDIDID";
		int n = s.length();		
		String result="";

		if (s.length() > 8) { // base check
			System.out.println("Sequence length is too long");
			return;
		}
		
		//Method 1: using stack
//		Stack<Integer> st = new Stack<>();
//		for (int i = 0; i <= s.length(); i++) {
//			st.push(i + 1);
//
//			if (i == s.length() || s.charAt(i) == 'I') {
//				while(!st.isEmpty()) {
//					result += String.valueOf(st.peek());
//					st.pop();
//				}
//			}
//		}
//		System.out.println(result);
		
		//Method 2: using loop
		int[] out=new int[n+1];
		int start=1;
		for(int i=0;i<=s.length();i++) {
			if(i==s.length() || s.charAt(i)=='I') {
				out[i]=start++;
				int j=i-1;
				while(j>=0 && s.charAt(j)!='I') {
					out[j]=start++;
					j--;
				}
			}
		}
		
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]);
		}
	}

}

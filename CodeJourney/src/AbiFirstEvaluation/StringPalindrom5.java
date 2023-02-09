package AbiFirstEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringPalindrom5 {

	public static void main(String[] args) {
		String s="abab";
		//Scanner sc=new Scanner(System.in);
		int n=1, left=1, right=4, count=0;
	
		
		StringPalindrom5 obj= new StringPalindrom5(); 
		
		
		while(n>0) { //n->testcase	
			count= obj.palindromCheck(s, left, right);			
			n--;
		}
		System.out.println(count);

	}
	
	public int palindromCheck(String s, int left, int right) {
		String word ="";
		int count=0, max=0, out=0;
		word=s.substring(left-1,right);
		
		for(int i=0;i<word.length()-1;i++) {
			int j=i+1;
			//Integer[] dp=new Integer[9];
			//Arrays.fill(dp, 0);
			while(j<word.length()) {
				if(word.charAt(i)== word.charAt(j)) {
					if(checkReverse(word.substring(i,j+1)) != 0) {
						count++;
						//dp[count] +=1;
					}	
					
				}
				
				j++;
				
			}
			max=Math.max(max, count);
		}		
		//out=2;
		return max;
	}
	
	public int checkReverse(String s) {
		int stringLen=0;	
		StringBuilder sb=new StringBuilder();
		sb.append(s);		
		
		if(s.equals(sb.reverse().toString())) {
			stringLen=s.length();
		}
		return stringLen;
	}
	
}

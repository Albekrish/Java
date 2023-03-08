package com.mentor.practice2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

	public static void main(String[] args) {
		int n=4;
		List<List<Integer>> out=new ArrayList<>();		

		for(int i=0;i<=n;i++) {	
			List<Integer> al=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				int result= fact(i)/(fact(i-j)*fact(j));
				al.add(result);
			}
			out.add(al);
		}
		
		System.out.println(out);

	}
	public static int fact(int num) {
		if(num==0)
			return 1;
		
		return num*fact(num-1);		
	}
}
//Pattern print code:

//for(int i=0;i<=n;i++) {
//for(int j=0;j<=n-i;j++) { //space
//	System.out.print(" ");
//}
//for(int j=0;j<=i;j++) {
//	int result= fact(i)/(fact(i-j)*fact(j));
//	System.out.print(result+" ");
//}
//System.out.println();
//}
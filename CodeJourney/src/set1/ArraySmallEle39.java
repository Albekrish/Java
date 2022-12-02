package set1;

import java.util.Arrays;

/*39) Java Program to print the smallest element in an array*/
public class ArraySmallEle39 {

	public static void main(String[] args) {
		int[] a= {9,7,6,4,3,2,-1};		
		int n=a.length;
//Method 1: native
		int small=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);
//Method 2:sorting
		
		Arrays.sort(a);
		
		int min=a[0];
		System.out.println(min);
		
		
	}

}

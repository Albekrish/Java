package javapractice;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr1= {3,2,5,7};
		int[] arr2= {2,3,5,7};
		
		if(areEqual(arr1,arr2)) {
			System.out.println("Two arrays are equal");
		}else {
			System.out.println("Not equal");
		}
		
	}
	public static boolean areEqual(int[] a,int[] b ) {
		
		if(a.length != b.length) return false;
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i]) return false;
		}
		return true; 
	}
}

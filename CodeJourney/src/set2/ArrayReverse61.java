package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Java Program to print the elements of an array in reverse order

public class ArrayReverse61 {

	public static void main(String[] args) {
		
			int[] a= {10,20,30,40,50};
			int n=a.length;
			
			//Method1: reverse looping
			
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			//Method2: using Collections.reverse
			Integer[] arr={10,20,30,40,50}; 
			
			Collections.reverse(Arrays.asList(arr));
			System.out.print(Arrays.asList(arr)+" ");
			
			System.out.println();
			//Method3: using temp array
			
			int b[] =new int[n];
			int j=n;
			
			for(int i=0;i<n;i++) {
				b[j-1]=a[i];
				j--;
			}
			System.out.println(Arrays.toString(b));
			System.out.println();
			
			//Method 4: using swapping
			
			int[] brr = { 10, 20, 30, 40, 50 };
			int bn=brr.length;
			
			for(int i=0;i<n/2;i++) {
				int temp=brr[i];
				brr[i]=brr[bn-i-1];
				brr[bn-i-1]=temp;
			}
			
			System.out.println(Arrays.toString(brr));
			
			
			
			
	}

}

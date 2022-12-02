package set1;

/*38) Java Program to print the largest element in an array*/
import java.util.Arrays;

public class ArrayLargeEle38 {

	public static void main(String[] args) {
		int[] a= {9,7,6,4,3,2,-1};		
		int n=a.length;
//Method 1: native
		int large=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
//Method 2:sorting
		
		Arrays.sort(a);
		
		int max=a[n-1];
		System.out.println(max);
	

	}

}

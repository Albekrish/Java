package set1;

import java.util.Arrays;

/*Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
Example: Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}*/
public class ArraySort10 {

	public static void main(String[] args) {
		//int[] a= {1,6,9,4,3,7,8,2};	//even
		int[] a={1,2,3,4,5,6,7}; //odd
		int n=a.length;
		
		Arrays.sort(a);
		
		int i=0,j=n-1;  //{1,2,3,4,6,7,8,9}  i<j
		
		while(i<j) {
			System.out.print(a[j]+" ");
			System.out.print(a[i]+" ");
			j--;
			i++;
		}
		
		if(n%2 !=0) {
			System.out.print(a[i]);
		}
		
	}

}

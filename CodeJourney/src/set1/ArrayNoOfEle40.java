package set1;

import java.util.Arrays;

/*40) Java Program to print the number of elements present in an array*/
public class ArrayNoOfEle40 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		
		//No.of element
		int n=a.length;
		
		//to print native method
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Using library function
		
		System.out.println(Arrays.toString(a));

	}

}

/*13. Find the fourth highest number in given array? You are given an array
consisting of 'N' integers. You have to find the fourth largest element present
in the array.*/

package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighNumArray13 {

	public static void main(String[] args) {
		
		int a[]= {3,46,89,6,45,33,98,1,0,-1,87};
		
		int n=a.length;
		System.out.println(n);
		/*
		        // Sort the array 'arr' elements in ascending order
		        // using nested for loops
		        for (int i = 0; i < length; i++) {
		            for (int j = i + 1; j < length; j++) {
		                if (array[i] > array[j]) {
		                    temporary = array[i];
		                    array[i] = array[j];
		                    array[j] = temporary;
		                }
		            }
		        } */
		//METHOD1: Sort
		Arrays.sort(a);
		// Sorting the array in descending order
		//  Arrays.sort(a, Collections.reverseOrder());
			
		System.out.println("sorted array"+Arrays.toString(a));
		System.out.println("fourth largets element:"+ a[n-4]);
		
		//METHOD 2: collection
		Integer b[]= {3,46,89,6,45,33,98,1,0,-1,87};
		int num=b.length;
		List <Integer> list= Arrays.asList(b);
		Collections.sort(list);
		// Collections.sort(list, Collections.reverseOrder());
		
		int max=list.get(num-4);
		System.out.println("fourth largets element:"+ max);
		
		
	}

}

/*Write a Program to Merge Two Arrays. We have to merge two arrays such
that the array elements maintain their original order in the newly merged
array. The elements of the first array precede the elements of the second
array in the newly merged array. For example:
1. int[] arr1={1, 2, 3, 4, 5, 6}; //first array
2. int[] arr2={7, 8, 9, 0}; //second array
3. int[] arr3={1, 2, 3, 4, 5, 6, 7, 8, 9, 0} //resultant array
*/
package pack;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray19 {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter arr1 elements:"); for(int
		 * i=0;i<arr1.length;arr1++);
		 */
		
		int[] arr1={1, 2, 3, 4, 5, 6}; 
		int[] arr2={7, 8, 9, 0};
		
		int a1=arr1.length;
		int a2=arr2.length;
		
		int res=a1+a2;
		
		int[] result=new int[res];
		
		//METHOD 1 --system.arraycopy
		System.arraycopy(arr1, 0, result, 0, a1);   //(Object src, int srcPos, Object dest, int destPos, int length);
		System.arraycopy(arr2, 0, result, a1, a2);		
		//System.out.println(Arrays.toString(result));
		
		//METHOD 2: Stream API
		
		/*
		 * public static <T> Object[] concatenate(T[] a, T[] b) 
		 * { 
		 *  return Stream.of(a, b)
		 * .flatMap(Stream::of).toArray();   OR
		 * 
		 * return Stream.concat(Arrays.stream(a),
                            Arrays.stream(b))
                    .toArray();
		 * }
		 * 
		 * public static void main (String[] args) { 
		 * 
		 * Integer[] a = new Integer[]{1,2,3};
		 * Integer[] b = new Integer[]{4,5,6};
		 * 
		 * Object[] c = concatenate(a,b);
		 * 
		 * 
		 * System.out.println("Merged object array : " + Arrays.toString(c)); } }
		 */
		
		//METHOD 3 --normal copy
		for(int i=0;i<a1;i++)
		{
			result[i]=arr1[i];
		}
		for(int i=0;i<a2;i++)
		{
			result[a1+i]=arr2[i];
		}
		for(int i=0;i<res;i++)
		{
			//System.out.print(result[i]+" ");
		}
		
				
	}

}

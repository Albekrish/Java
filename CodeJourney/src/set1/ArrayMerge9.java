package set1;

import java.util.Arrays;
import java.util.HashSet;

/*) Given two sorted arrays, merge them such that the elements are not repeated
Example 1:
Input: Array 1: 2,4,5,6,7,9,10,13
         Array 2: 2,3,4,5,6,7,8,9,11,15
Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15*/
public class ArrayMerge9 {

	public static void main(String[] args) {
		int[] a= {2,4,5,6,7,9,10,13};
		int[] b= {2,3,4,5,6,7,8,9,11,15};
		
		int n=a.length+b.length;
		int[] temp=new int[n];
		
		int k=0;
		//Method 1
		/*for(int i=0;i<a.length;i++) {
			temp[k]=a[i];
			k++;
		}
		
		for(int i=0;i<b.length;i++) {
			temp[k]=b[i];
			k++;
		} */
		
		//Method 2 (source, source pos, dest, dest pos, length to be copied
		System.arraycopy(a, 0, temp, 0, a.length);
		System.arraycopy(b, 0, temp, a.length, b.length);
		
		Arrays.sort(temp);
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i:temp) {
			hs.add(i);
		}
		
		int[] res= new int[hs.size()];
		int m=0;
		for(int i:hs) {
			res[m]=i;
			m++;
		} 
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(res));
	}

}

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
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] > a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[n-4]);
		
		
		/*
		 * Arrays.sort(a);    //reverse --> Arrays.sort(a, Collections.reverseOrder());
		 * System.out.println(Arrays.toString(a));
		 * System.out.println(a[n-4]);
		 */
		
		
		/*
		 * Integer b[]= {3,46,89,6,45,33,98,1,0,-1,87}; List<Integer> al=
		 * Arrays.asList(b); Collections.sort(al);   //reverse--> Collections.sort(list, Collections.reverseOrder());
		 * System.out.println(al.get(al.size()-4));
		 */
	}

}
	

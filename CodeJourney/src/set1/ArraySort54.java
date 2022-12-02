package set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
54) Write a program to sort the elements in odd positions in descending order and
elements in ascending order.
Eg 1:  Input:  13,2,4,15,12,10,5
         Output: 13,2,12,10,5,15,4
Eg 2:  Input: 1,2,3,4,5,6,7,8,9
         Output: 9,2,7,4,5,6,3,8,1*/
public class ArraySort54 {
	public static void main(String[] args) {
		/*
		 * //int[] arr = {1,2,3,4,5,6,7,8,9}; int[] arr= {13,2,4,15,12,10,5}; int n =
		 * arr.ngth;
		 * 
		 * List<Integer> el=new ArrayList<>(); List <Integer> ol=new ArrayList<>();
		 * 
		 * for(int i=0;i<n;i++) { if(i%2 == 0) { //0,2,4,6 ->odd position
		 * ol.add(arr[i]); }else { el.add(arr[i]); } }
		 * 
		 * Collections.sort(el); Collections.sort(ol, Collections.reverseOrder());
		 * 
		 * int j=0,k=0; for(int i=0;i<el.size()+ol.size();i++) { if(i%2==0) { arr[i]=
		 * ol.get(j); j++; }else { arr[i]=el.get(k); k++; } }
		 * 
		 * for(int e:arr) { System.out.print(e+" "); }
		 */	
		    
		int[] a= {13,2,4,15,12,10,5};
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=i;j<n;j=j+2) {
					for(int k=i;k<n;k=k+2) {
						if(a[j]>a[k]) {
							temp=a[j];
							a[j]=a[k];
							a[k]=temp;
						}
					}
				}
			}else {
				for(int j=i;j<n;j=j+2) {
					for(int k=i;k<n;k=k+2) {
						if(a[j]<a[k]) {
							temp=a[j];
							a[j]=a[k];
							a[k]=temp;
						}
					}
				}
		}
			
	}
		for(int k:a) {
			System.out.print(k+" ");
		}
	
}		

}
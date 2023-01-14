package set1;

import java.util.ArrayList;

/*44) Java Program to print the duplicate elements of an array*/
public class ArrayDuplicateEle44 {

	public static void main(String[] args) {
		int[] a= {2,3,4,2};
		//For two element comparison
		for(int i=0;i<a.length-1;i++) {  //we can also do till a.length
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
		ArrayList <Integer> al=new ArrayList<>();
		int n=a.length;
		//for more than two occurrence comparison
		for(int i=0;i<n-1;i++) {   //n-1
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					if(!al.contains(a[i])) {
						al.add(a[i]);
					}
				}
			}
		}
		
		
	}

}

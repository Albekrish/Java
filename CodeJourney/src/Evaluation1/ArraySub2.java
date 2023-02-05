package Evaluation1;

import java.util.Arrays;

public class ArraySub2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,5};
		
		int n=a.length;
		
		int left=0;
		int right=a.length-1;
		int mid=a.length/2;		
		
		while(left<mid || mid<right) {
			
			int shift=recursion(left, right, mid, n, a);
			if(shift == -1) {				
				mid=mid-1;
			}else if(shift == 1) {
				mid=mid+1;
			}else {
				break;
			}
			
		}
		if(mid == left || mid==right) {
			System.out.println(-1);
		}else {
			// display
			int[] res1=new int[mid];
			int[] res2=new int[n-mid];
			int k=0;
			for(int i=left;i<mid;i++) {
				res1[k++]=a[i];
			}
			k=0;
			for(int i=mid;i<=right;i++) {
				res2[k++]=a[i];
			}
			
			System.out.println(Arrays.toString(res1));
	
			System.out.println(Arrays.toString(res2));
		}
	}
	
	public static int recursion(int left, int right, int mid, int n, int[] a) {
		int sum_left=0, sum_right=0;
		for(int i=0;i<mid;i++) {
			sum_left += a[i];
		}
		for(int i=mid;i<n;i++) {
			sum_right += a[i];
		}
		
		if(sum_left >sum_right) {
			return -1;
		}else if(sum_left <sum_right) {
			return 1;
		}else {
			return 0;
		}
	}

}

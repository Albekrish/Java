package com.mentor.practice1;

public class TrapWater2 {

	public static void main(String[] args) {
		int[] a={0,1,0,2,1,0,1,3,2,1,2,1};
		int maxLeft=0, maxRight=0, result=0;
		int left=0,right=a.length-1;
		
		while(left<=right) {
			if(a[left]<=a[right]) {
				if(a[left]>=maxLeft) {
					maxLeft=a[left];
				}else {
					result += maxLeft-a[left];
				}
				left++;
			}else {
				if(a[right]>=maxRight) {
					maxRight=a[right];
				}else {
					result += maxRight-a[right];
				}
				right--;
			}
		}
		System.out.println(result);

	}

}

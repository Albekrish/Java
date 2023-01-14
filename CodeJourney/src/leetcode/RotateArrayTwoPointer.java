package leetcode;

import java.util.Arrays;

public class RotateArrayTwoPointer {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9};
		int k=3;
		int n=nums.length-1;
		k %= nums.length; //for onr element we get indexbound so to avoid
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
		
		System.out.println(Arrays.toString(nums));
		
	}
	public static void reverse(int[] nums, int i,int j) {
		
		while(i<j) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
		
	}
}

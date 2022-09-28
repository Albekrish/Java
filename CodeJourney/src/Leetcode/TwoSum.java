package Leetcode;

import java.util.Scanner;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
public class TwoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int[] result=twoSum(a,sum);
		for(int x:result) {
		System.out.print(x+" ");
		}
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int[] result= new int[2];
	        
	        for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j] == target){
	                    result[0]=i;
	                    result[1]=j;
	                    break;
	                }
	            }
	        }
	        return result;

	 }
}

package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int n = nums.length;
		HashSet<Integer> hs = new HashSet<>();

		if (n <= 1) {
			System.out.println(false);
		} else {
			
			  for(int i=0;i<n-1;i++){ for(int j=i+1;j<n;j++){ //
			  System.out.println(i+"-"+j); if(nums[i]==nums[j]){ System.out.println(true);
			  } } }
			  
			 
			/*
			 * for(int i=0;i<n;i++){ if(!hs.contains(nums[i])){ hs.add(nums[i]);
			 * System.out.println(hs); }else{ System.out.println(true); } }
			 */
		}
		System.out.println(false); // keep condition to keep false simply i wrote

	}
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

//78. Subsets
public class SubSet {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int n=nums.length;
		
		/*
		 * List<Integer> numsList=new ArrayList<>(); //converted array to List
		 * 
		 * for(int i:nums) { numsList.add(i); }
		 */
 		
		List<List<Integer>> result=new ArrayList<>();
		subsetRecursion(0,nums,result, new ArrayList<Integer>());
		

		for(List<Integer> entry : result)
			System.out.println(entry);
	}
	public static void subsetRecursion(int start, int[] nums, List<List<Integer>> result, List<Integer> current) {
		
		result.add(new ArrayList<>(current));
		
		for(int i=start; i<nums.length;i++) {
			current.add(nums[i]);
			subsetRecursion(i+1, nums, result,current);
			current.remove(current.size()-1);
		}
	}
}

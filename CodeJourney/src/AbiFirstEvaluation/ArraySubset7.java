package AbiFirstEvaluation;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset7 {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<List<Integer>> result=new ArrayList<>();
		
		ArraySubset7 obj=new ArraySubset7();		
		obj.helper(0, arr, result, new ArrayList<Integer>());
		
		for(List<Integer> entry : result) {
			System.out.println(entry);
		}

	}
	
	public void helper(int start, int[] nums, List<List<Integer>> result, List<Integer> current) {
		
		result.add(new ArrayList<Integer>(current));
		
		for(int i=start;i<nums.length;i++) {
			current.add(nums[i]);
			helper(i+1, nums,result, current);
			current.remove(current.size()-1);
		}
		
	}
}

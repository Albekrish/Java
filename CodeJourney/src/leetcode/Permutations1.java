package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Permutations1 {
		
		public static void main(String[] args) {	
			int nums[] = {1,2,3};
			
			List<Integer> numsList = new ArrayList<>();
			for(int i=0;i<nums.length;i++)
				numsList.add(nums[i]);  //array to list
			
			List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
			permute(0, numsList, result);		
			
			for(ArrayList<Integer> entry : result)
				System.out.println(entry);
		}
		
		public static void permute(int start, List<Integer> nums, List<ArrayList<Integer>> result) {
			
			if(start == nums.size()-1) {  //      start==2
				result.add(new ArrayList<>(nums));
				return;
			}
			
				
			for(int i=start;i<nums.size();i++) { //0 to 2
				Collections.swap(nums, i, start); //Collections.swap(list, i, j); swap i & j
				permute(start+1, nums, result);
				Collections.swap(nums, i, start);
			}		
		}

}

package AbiFirstEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoneyCombination1 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6};
		int m=6;
		int k=2;
		
		Arrays.sort(arr);
				
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j]) == m) {
					System.out.println(Arrays.toString(new int[] {arr[i],arr[j]}));
				}
			}
		}
	}
}

//using combination:

//		List<List<Integer>> result=new ArrayList<>();
//		
//		MoneyCombination1 obj=new MoneyCombination1();		
//		obj.helper(0, m,k, arr, result, new ArrayList<Integer>());
//		
//		for(List<Integer> entry : result) {
//			System.out.println(entry);
//		}
//
//	}
//	public void helper(int start, int sum, int flavor,  int[] nums, List<List<Integer>> result, List<Integer> current) {
//		
//		if(sum<0) return;
//	    HashSet<Integer> hs=new HashSet<>();
//	    
//		if(sum==0 && current.size() == flavor) {		
//			result.add(new ArrayList<Integer>(current));
//			return;
//		}
//		for(int i=start;i<nums.length;i++) {
//			if(!hs.contains(nums[i])){
//				current.add(nums[i]);
//			}
//			helper(start+1, sum-nums[i], flavor, nums,result, current);			
//			current.remove(current.size()-1);
//		}
//
//}
//}

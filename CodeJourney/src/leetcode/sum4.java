package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4Sum
public class sum4 {

	public static void main(String[] args) {
		int[] nums= {1,0,-1,0,-2,2};
		//int[] nums= {-1,0,1,0};
		
		Arrays.sort(nums);
	        List<List<Integer>> result=new ArrayList<>(); 	        
	            int left, right;			
				 
				  for(int i=0;i<nums.length-2;i++) {
					  for(int j=i+1;j<nums.length-1;j++) {
						 left=j+1;
						 right=nums.length-1;
						  while(left<right) {
							  int target=nums[left]+nums[i]+nums[j]+nums[right];
							 List<Integer> al=new ArrayList<>();							 
							 if(target ==0) {
								 al.add(nums[left]);								   
								 al.add(nums[i]);
								 al.add(nums[j]);
								 al.add(nums[right]);
							  
								  if(!result.contains(al)){ 
									  result.add(al); 
								  }	
								  left++;
								  right--;
							 }else if(target<0) {
								 left++;
							 }else {
								 right--;
							 }
						 }
					 }
				 }
		System.out.println(result);
	}

}

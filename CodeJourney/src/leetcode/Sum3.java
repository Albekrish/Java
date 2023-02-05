package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//15. 3Sum
public class Sum3 {

	public static void main(String[] args) {
		//int[] nums= {-1,0,1,2,-1,-4};
		int[] nums= {-1,0,1,0};
		
		Arrays.sort(nums);
	        List<List<Integer>> result=new ArrayList<>(); 	        
	            int left=0;
	            int right=nums.length-1;
				
	            for(int i=0;i<nums.length-2;i++){ 
	            	left=i+1;
				  	while(left<right){
						  List<Integer> al=new ArrayList<>(); 	
						  int target=nums[left]+nums[right]+nums[i] ;
							  if(target == 0){ 
								  al.add(nums[left]);								   
								  al.add(nums[i]);
								  al.add(nums[right]);
								  
								  if(!result.contains(al)){ 
									  result.add(al); 
								  }
								 left++;
								 right--;
							  }	else if(target<0){
								  left++;
							  }else {
								  right--;
							  }	
					  } 
					  					  
				  } 				  
				  
				  System.out.println(result);
				 
	       
				/*
				 * int low=0, high=1;
				 * 
				 * for(int i=2;i<nums.length;i++) { List<Integer> al=new ArrayList<>();
				 * if(nums[i]+nums[low]+nums[high] ==0) { al.add(nums[low]); al.add(nums[high]);
				 * al.add(nums[i]); if(!result.contains(al)){ result.add(al); } } low++; high++;
				 * } System.out.println(result);
				 */
	}

}

package leetcode;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] nums = {0,2};
        if(nums.length<2){
           System.out.println(nums[0]);
        }
        int max_ending=1;
        int max_so=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
        	if(nums[i] != 0) {
	            max_ending *= nums[i];
	
	            if(max_so < max_ending){
	                max_so=max_ending;
	            }  
        	}else {
        		continue;
        	}
        }
        System.out.println(max_so);
	}

}

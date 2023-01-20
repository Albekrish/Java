package leetcode;

import java.util.Arrays;

public class Sum3Closet {

	public static void main(String[] args) {
	    int[] nums= {-1,2,1,-4};
	    int target=1;
	    Arrays.sort(nums);
        int diff=Integer.MAX_VALUE, ret=0;
        for(int i=0 ; i<nums.length-2 ; i++) {
            int s=i+1, e=nums.length-1;
            while(s<e) {
                int sum = nums[i]+nums[s]+nums[e];
                if(Math.abs(target-sum)<diff) {
                    diff = Math.abs(target-sum);
                    ret = sum;
                }
                if(sum<target) s++;
                else if(sum>target) e--;
                else System.out.println(target);
            }
        }

	     System.out.println(ret);  
	  }

}

package leetcode;

public class JumpGame2 {
	
	public static void main(String[] args) {
		int[] nums= {2,3,1,1,4};
		  int n=nums.length;
		  
		 int jump=0, currentend=0, nextend=0;
		 
		 for(int i=0;i<nums.length-1;i++) {
			 nextend=Math.max(nextend, i+nums[i]);
			 if(i==currentend) {
				 jump++;
				 currentend=nextend;
			 }
		 }
		 System.out.println(jump);
	}
}

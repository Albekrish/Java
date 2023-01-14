package leetcode;
//55. Jump Game

public class JumpGame {

	public static void main(String[] args) {
		int[] nums= {0};
		int n=nums.length;
		
		if(n<=1) {
			System.out.println(true);
			return;
		}
		boolean result=false;
		
		int start=0;
		int end=n-1; //4
		
		while(start<=end) {
			int value=nums[start]; //3 0
			if(value==0) {
				break;
			}
			int next=start+value; //3 3
			
			if(nums[next] == nums[end]) {
				result=true;
				break;
			}else{
				next += nums[next]; //3
				start=next; //3
			}
			
		}
		System.out.println(result);

	}

}

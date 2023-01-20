package leetcode;

public class ArthimeticSlices {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int current=0, total=0; 
		
		for(int i=2;i<nums.length;i++) { //keep i at index 2
			if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) {
				current++;
			}else {
				current=0;
			}
			total += current;
		}
		System.out.println(total);
	}
}

package Leetcode;

/*Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class RemoveElement {

	public static void main(String[] args) {
		int[] num = {0,1,2,2,3,0,4,2};
		int value = 2;
		System.out.println(removeElement(num, value));

	}
	
	public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int j=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] != val) {
        		nums[j]=nums[i];
        		j++;
        	}
        }
        return j;
    }

}

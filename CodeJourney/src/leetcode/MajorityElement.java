package leetcode;
// 169. Majority Element
import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums= {6,6,6,7,7};
        int n=nums.length;

        Arrays.sort(nums); //1,1,1,2,2,2,2
        System.out.println(Arrays.toString(nums));
        int count=1;
        int max=0;
        int result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;               
            }else {
            	count=1;
            } 
            if(count>max) {
                result=nums[i];
            }
            max=Math.max(max,count);          
        }
        System.out.println(result);
    }

}

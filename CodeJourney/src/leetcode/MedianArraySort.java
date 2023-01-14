package leetcode;

import java.util.Arrays;

public class MedianArraySort {

	public static void main(String[] args) {
		int[] nums1= {1,2};
		int[] nums2= {3,4};
		
		int[] res=new int[nums1.length+nums2.length];
		
        System.arraycopy(nums1,0,res,0,nums1.length);
        System.arraycopy(nums2,0,res,nums1.length,nums2.length);
        Arrays.sort(res);
        
        System.out.println(Arrays.toString(res));
        double mid=0.0;

        int center=res.length/2;
        if(res.length% 2 !=0){ //odd            
             mid=res[center];
        }else{           
            mid=(double)(res[center]+res[center-1])/2;
        }
        //return mid;
        System.out.println(mid); 
    }
}



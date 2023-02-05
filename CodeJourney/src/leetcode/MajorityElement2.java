package leetcode;
//229: Majority element 2
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

	public static void main(String[] args) {
		int[] nums= {3,2,3};
		
		 /*  List<Integer> al=new ArrayList<>();
	        HashMap<Integer, Integer> hm=new HashMap<>();

	        boolean flag=false;
	        for(int i=0;i<nums.length;i++){
	        	if(hm.containsKey(nums[i])) {
	        		hm.put(nums[i], hm.get(nums[i])+1);
	        	}else {
	        		hm.put(nums[i], 1);
	        	}
	        }
	    
	       for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
	           if(entry.getValue() > (nums.length/3)){
	               al.add(entry.getKey());
	               flag=true;
	           }
	       }
	       System.out.println(al); 
*/       //Method 2: 
       
       int freq  = nums.length/3;
       List<Integer> list = new ArrayList<Integer>();
       Arrays.sort(nums);
       int count=1;
       		
           for(int i=0;i<nums.length-1;i++)
           {
              if(nums[i] == nums[i+1]) {
            	  count++; 
              }else {
            	  count=1;
              }
              
              if(count > freq && !list.contains(nums[i])) { 
        		  list.add(nums[i]);
              } 
           }
           
       System.out.println(list);
    }

}

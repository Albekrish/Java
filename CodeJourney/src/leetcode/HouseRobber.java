package leetcode;

//198. House Robber

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		int even=0,odd=0;
        for(int i=0;i<nums.length;i++){
        	if(i%2 != 0){  
        		odd += nums[i]; 
        		odd=even>odd ? even:odd;
        	}
        	else{  
        		even += nums[i]; 
        		even=even>odd? even:odd;
        	}                     
        }

        if(even>odd){
            System.out.println(even);;
        }else{
            System.out.println(odd);
        }
             
	}

}

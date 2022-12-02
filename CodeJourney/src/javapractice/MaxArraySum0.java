package javapractice;

import java.util.HashSet;

public class MaxArraySum0 {

	public static void main(String[] args) {	
		int[] arr= {4,2,-3,1,6};
		
		//Method 1: o(N^2)
        boolean result=false;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == 0){
                  result=true;  
                }
            }
        }
        System.out.println(result);
        
        //Method 2
    	HashSet<Integer> hs=new HashSet<>();
    	 int sum=0;
    	 boolean output=false;
    	for(int i=0;i<arr.length;i++){
           sum += arr[i];
           if(sum==0 || arr[i]==0 || hs.contains(sum)) {
        	  output=true;
           }
           hs.add(sum);
    	}
    	System.out.println(output);
        
	}
    	

}

package leetcode;

public class SumOfOddLengthSubarray {
	
	static int OddLengthSum(int[] arr)
	{	     
	    int sum = 0; 
	    int l = arr.length;	  
	   
	    for(int i = 0; i < l; i++)
	    {	         
	        // Generate all subarray of
	        // odd length
	        for(int j = i; j < l; j += 2)
	        {
	            for(int k = i; k <= j; k++)
	            {
	                sum += arr[k];
	            }
	        }
	    }
	    return sum;
	}	  
	
	public static void main (String[] args)
	{     	    
	    int[] arr = { 1, 4, 2, 5, 3}; // 1,4,2,5,3,1 4 2, 4 2 5, 2 5 3, 1 4 2 5 3
	    System.out.print(OddLengthSum(arr));
	}
	

}

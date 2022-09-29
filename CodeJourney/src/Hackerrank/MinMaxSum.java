package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
Sample Input

1 2 3 4 5

Sample Output

10 14*/

public class MinMaxSum {

	public static void main(String[] args) {	
		
		List<Integer> arr= new ArrayList<>();
		 for (int i = 1; i < 6; i++) {	            
	            arr.add(i);	            
	        }

	        Collections.sort(arr);
	        long sum=0;
	        for(int i=0;i<arr.size();i++){
	        	System.out.println(arr.get(i));
	            sum += arr.get(i);
	        }
	        long min_sum= sum- arr.get(arr.size()-1);
	        long max_sum=sum-arr.get(0);
	        
	        //Method 2: using stream Api
	        long max=arr.stream().skip(1).mapToLong(Long :: valueOf).sum();
	        long min=arr.stream().limit(arr.size()-1).mapToLong(Long :: valueOf).sum();
	        System.out.println(min_sum+" "+max_sum);
	        System.out.println(min+" "+max);

	    }	

}





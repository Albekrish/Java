package javapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//i/p:
//10
//3 2 5 5 5 2 2 5 2 3           11 3 18 7 13 16 16 4 18 9
//o/p: 3
public class MapFreqCount {
	// Function to find largest number with minimum frequency
	public static void main(String[] args) {
			int[] arr= {11,3,18,7,13,16,16,4,18,9};
			//Arrays.sort(arr);
			int n=arr.length;
	        TreeMap<Integer, Integer> hm=new TreeMap<>();
			
			  for(int i:arr){ 
			  		if(hm.containsKey(i)){ 
			  			hm.put(i,hm.get(i)+1); 
			  		}else{
			  			hm.put(i,1); 
			  } }
			 
	        
			/*
			 * for (int i = 0; i < n; i++) { if(hm.containsKey(arr[i])){ hm.put(arr[i],
			 * hm.get(arr[i])+1); }else{ hm.put(arr[i], 1); } }
			 */
	 System.out.println(hm);  
	 int min_freq=Integer.MAX_VALUE;
	 int max_no=Integer.MIN_VALUE;
	 
	 for (Map.Entry<Integer,Integer> x : hm.entrySet()){
		 
	     int num = x.getKey();
	     int freq = x.getValue();
		 if(freq < min_freq) {
			min_freq= freq;
			max_no=num;
		 }else if (freq == min_freq && max_no < num) {
            max_no = num;
        } 
		
		// System.out.println(value);
	 }
	 
	System.out.println(max_no);
	 
	}

}

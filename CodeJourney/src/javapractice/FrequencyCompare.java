package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCompare {

	public static void main(String[] args) {
		int[] nums= {1,1,2,2,2,3};
		int[] result =new int[nums.length];
		int index=0;
		
		 HashMap<Integer, Integer> hm=new HashMap<>();
		 for(Integer i: nums) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		 }
		 System.out.println(hm);
		 
		 ArrayList<Map.Entry<Integer, Integer>> al=new ArrayList<>(hm.entrySet());
		 Collections.sort(al, (e1,e2)-> {
		 return (e1.getValue() == e2.getValue())? e2.getKey()-e1.getKey() : e1.getValue().compareTo(e2.getValue());
				 
		 });
		 
		 for(Map.Entry<Integer, Integer> entry: al) {
			 for(int i=0;i<entry.getValue();i++) {
				 result[index++]=entry.getKey();
			 }
		 }
		 System.out.println(Arrays.toString(result));
	}

}

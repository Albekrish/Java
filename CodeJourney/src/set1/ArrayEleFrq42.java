package set1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*42) Java Program to find the frequency of each element in the array*/

public class ArrayEleFrq42 {

	public static void main(String[] args) {
		int[] a= {10,20,20,10,10,20,5,20};
		int n=a.length;
		
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    int count=1;
	    
	    for(int i=0;i<n;i++) {
	    	if(hm.containsKey(a[i])) {
	    		hm.put(a[i], hm.get(a[i])+1);
	    	}else {
	    		hm.put(a[i], 1);
	    	}
	    }
	
	    for(Map.Entry<Integer, Integer> e:hm.entrySet())
	    {
				System.out.println(e.getKey()+"-"+e.getValue()); 
		 
	     }

	}

}

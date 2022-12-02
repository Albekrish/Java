package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*We are given the details of marks scored by students in form of a HashMap, 
where the name of the student is the Key and the marks scored is the Value.
Our task is to sort the map according
to the key values i.e the names of the students in the alphabetical(lexicographical) order.
*/
public class SortHashMapKey {
//sorting using tree and list is same for HashSet also


	public static void main(String[] args) {
		//Method1: using tree
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        
        TreeMap<String,Integer> tm=new TreeMap<>(map);       
        
		//System.out.println(tm);
		//To print
		for(Map.Entry<String, Integer> e: tm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
				
		//Method2: using list ==>key based sort
		ArrayList<String> al=new ArrayList<>(map.keySet());
		Collections.sort(al);
		
		
		for(String s: al) {
			System.out.println(s+"-"+map.get(s));
		}
		
		
	}

}

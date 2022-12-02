package javapractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReverseSortHashMapSet {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        
        
      //descending sort
      		TreeMap<String,Integer> th=new TreeMap<>(map);
      		System.out.println(th.descendingKeySet());
      		//&& direct descending 
      		TreeMap<String,Integer> t=new TreeMap<>(Collections.reverseOrder());
      		t.putAll(map);
      		System.out.println(t);

      // set ==> //to reverse use ts.descendingSet();
      		
      		 TreeSet<Integer> ints = new TreeSet<>();
             ints.add(2);
             ints.add(20);
             ints.add(10);
             ints.add(5);
             ints.add(7);
             ints.add(3);
             
             System.out.println(ints.descendingSet());
             
             TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
             ts.addAll(ints);
             System.out.println(ts);
             

	}

}

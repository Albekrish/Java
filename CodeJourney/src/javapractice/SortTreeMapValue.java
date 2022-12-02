package javapractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
//using priority queue  
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortTreeMapValue {

	public static void main(String[] args) {
		//Method 1: using priority queue
		 TreeMap<String, Integer> map = new TreeMap<String, Integer>();	      
	        // Put elements to the map
	        map.put("Anshu", 2);
	        map.put("Rajiv", 4);
	        map.put("Chhotu", 3);
	        map.put("Golu", 5);
	        map.put("Sita", 1);
	        //send map's entry to queue and pass comparator using lambda expression
	        Queue <Map.Entry<String, Integer>> q=new PriorityQueue<>((a,b)->
													{return a.getValue()-b.getValue();});
	       System.out.println(map);
	       
	       for(Map.Entry<String, Integer> e:map.entrySet()){
	    	   q.add(e);
	       }
	      // System.out.println(q.isEmpty());
	        while(!q.isEmpty()) {
	        	System.out.println(q.poll().getValue());
	        	
	        }
	        
	        //Method2: using stream and LinkedMap
	        //https://www.youtube.com/watch?v=7pC3PYrpdrw
	        
	        Map<String, Integer> hm = new HashMap<>();	      
	        hm.put("Anshu", 2);
	        hm.put("Rajiv", 4);
	        hm.put("Chhotu", 3);
	        hm.put("Golu", 5);
	        hm.put("Sita", 1);
	        hm.put("Raji", 4);
	        
	       LinkedHashMap<String, Integer> sorted= hm.entrySet().stream().sorted((e1,e2)->{ 
	    	   return e1.getValue()-e2.getValue();
	        			}).collect(Collectors.toMap(Map.Entry :: getKey,
	        					Map.Entry :: getValue,(e1,e2)->e1,LinkedHashMap::new));
	       
	       System.out.println(sorted);
	       
	       //Method 3: using list and comparator
	       Map<String, Integer> hm1 = new HashMap<>();	      
	        hm1.put("Anshu", 2);
	        hm1.put("Rajiv", 4);
	        hm1.put("Chhotu", 3);
	        hm1.put("Golu", 5);
	        hm1.put("Sita", 1);
	        hm1.put("Raji", 4);
	       
	        Set<Entry<String, Integer>> entryset = hm1.entrySet();
	        
	        List<Entry<String,Integer>> list=new ArrayList<>(entryset);
	        Collections.sort(list, new Comparator<Entry<String,Integer>>(){
	        	@Override
	        	public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
	        		return e1.getValue()-e2.getValue();
	        	}
	        		
	        });
	        
	        LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
	        
	        for(Entry<String, Integer> e: list) {
	        	lhm.put(e.getKey(), e.getValue());
	        }
	        
	        System.out.println(lhm);
	    }
	        
	}



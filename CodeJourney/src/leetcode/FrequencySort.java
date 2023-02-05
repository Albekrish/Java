package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

	public static void main(String[] args) {
		String s="tree";
		  HashMap<Character, Integer> hm=new HashMap<>();

	        for(Character c:s.toCharArray()){
	            hm.put(c, hm.getOrDefault(c,0)+1);
	        }

	        PriorityQueue<Character> pq=new PriorityQueue<>((x,y)->hm.get(y)-hm.get(x));

	        for(Character c:hm.keySet()){
	            pq.offer(c);
	        }
	       // System.out.println(pq);
	        StringBuilder sb= new StringBuilder();
	        while(!pq.isEmpty()){
	            char ch=pq.poll();

	            for(int i=0;i<hm.get(ch);i++){
	                sb.append(ch);
	            }
	        }

	        //return sb.toString();
	        System.out.println(sb.toString());

	}

}

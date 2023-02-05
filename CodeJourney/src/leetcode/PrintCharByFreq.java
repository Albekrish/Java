package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class PrintCharByFreq {

	public static void main(String[] args) {
		String s="tree";
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		PriorityQueue<Character> pq=new PriorityQueue<>((x,y)->hm.get(y)-hm.get(x));
		
		for(Character c:hm.keySet()) {
			pq.offer(c);
		}
		
		StringBuilder sb=new StringBuilder();
		while(!pq.isEmpty()) {
			char ch=pq.poll();
			
			for(int i=0;i<hm.get(ch);i++) {
				sb.append(ch);
			}
		}
		
		System.out.println(sb.toString());
		

		
		
	}

}

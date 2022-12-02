package javapractice;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapPartiesSeat {

	public static void main(String[] args) {
		String[] party= {"A","B","C","D","E","F","G"};
		int[] seat= {90,150,33,23,17,500,2};
		
		int n=7;
		
		TreeMap<String,Integer> hm=new TreeMap<>();
        for(int i=0;i<n;i++){
            hm.put(party[i], seat[i]);
        }
		
        int max= Collections.max(hm.values());
        for(Map.Entry<String, Integer> es:hm.entrySet()) {
        	System.out.println(es.getKey()+""+es.getValue());
        }
        System.out.println(max);

	}

}

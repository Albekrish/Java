package javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Input: 
S = "geeksforgeeks", N = 2
Output: 4
Explanation: 'g', 'e', 'k' and 's' have
2 occurrences.*/

public class CountChar {

	public static void main(String[] args) {
		String S= "geeksforgeeks";
		int N=2;
		//Method1
		int[] count=new int[26];
        int res=0;
        
        for(int i=0;i<S.length();i++){        	
            count[S.charAt(i)-'a']++;            
        }
        //System.out.println(Arrays.toString(count));
        for(int a:count){ 
        	if(a == N){ 
        		res++; 
        	}
        }
		 
   // System.out.println(res);
    
  
    
    //Method2:
    
    HashMap<Character, Integer> hm1= new HashMap<>();
    Character prev='#';
     for(char c:S.toCharArray()) {
    	 if(prev != c) {
    		 hm1.put(c, hm1.getOrDefault(c,0)+1);
    	 } 
    	 prev=c;
     }
     
     int out1=0;
    for( Character e: hm1.keySet()) {
    	if(hm1.get(e) == N) {
    		out1++;
    	}
    }
    System.out.println(out1);
    }    
	

}

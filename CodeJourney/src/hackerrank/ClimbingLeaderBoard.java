package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClimbingLeaderBoard{
	
	public static List<Integer> climbingLeaderboardMethod(List<Integer> ranked, List<Integer> player) {
	     HashMap<Integer,Integer> hm= new HashMap<>();
	     List<Integer> result= new ArrayList<>();
	     int rank=1;
	     for(Integer i:ranked){
	         if(hm.containsKey(i)== false){
	             hm.put(i, rank);
	             rank++;
	         }
	     }
	     int temp=ranked.size()-1;
	    for(Integer score:player) {
	    	for(int i=temp;i>=0;i--) {
	    		if(score >= ranked.get(i)) {
	    			rank=hm.get(ranked.get(i));
	    			temp=i-1;
	    		}else {
	    			break;
	    		}
	    	}
	    	result.add(rank);
	    }
	     return result;	     
	}
	
	public static void main(String[] args){
	        
	        List<Integer> ranked = new ArrayList<>();
	        List<Integer> player = new ArrayList<>();

	        ranked.add(100);
	        ranked.add(100);
	        ranked.add(50);
	        ranked.add(40);
	        ranked.add(40);
	        ranked.add(20);
	        ranked.add(10);
	        
	        player.add(5);
	        player.add(25);
	        player.add(50);
	        player.add(120);
	        

	        List<Integer> result = climbingLeaderboardMethod(ranked, player);

	        for (int i = 0; i < result.size(); i++) {	           
	           System.out.println(result.get(i)); 
	        }	       
	}

}

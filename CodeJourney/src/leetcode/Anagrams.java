package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
	public static void main(String[] args) {
		Anagrams a=new Anagrams();
		List<Integer> s= a.findAnagrams("listen", "silent");
		System.out.println(s);
	}
	    public List<Integer> findAnagrams(String s, String p) {
	        List<Integer> list=new ArrayList<>();
	        int slength=s.length();
	        int plength=p.length();
	        int i = 0;
	        int j = p.length();

	        char[] pstring=p.toCharArray();
	        Arrays.sort(pstring);
	        while(i<=slength-plength){
	            char[] sstring=s.substring(i,j).toCharArray();
	            Arrays.sort(sstring);
	            if(Arrays.equals(sstring,pstring)){
	                list.add(i);
	            }
	            i++;
	            j++;
	        }
	        return list;
	       
	}
}

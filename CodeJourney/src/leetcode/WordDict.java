package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordDict {

	public static void main(String[] args) {
		String s="leetcodeleet";
		List<String> wordDict= new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		
	// method 1: using recursion		
		
		System.out.println(wordDict(s, wordDict));
	
	}
public static boolean wordDict(String s, List<String> wordDict) {
	
	if(wordDict.contains(s)) {
		return true;
	}
	
	for(int i=1;i<=s.length();i++) {
		String left=s.substring(0,i);
		if(wordDict.contains(left) && wordDict(s.substring(i), wordDict)) {
			return true;
		}
	}
	return false;
}
}

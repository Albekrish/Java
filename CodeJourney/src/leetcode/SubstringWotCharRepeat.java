package leetcode;

import java.util.HashSet;

//3. Longest Substring Without Repeating Characters

public class SubstringWotCharRepeat {

	public static void main(String[] args) {
		String s="abcabcbb";
		//Using sliding window technique
		
		int a_pointer=0;
		int b_pointer=0;
		int max=0;
		
		HashSet<Character> hs= new HashSet<>();
		
		while(b_pointer <s.length()) {
			if(!hs.contains(s.charAt(b_pointer))) {
				hs.add(s.charAt(b_pointer));
				b_pointer++;
				max=Math.max(hs.size(), max);
			}else {
				hs.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		System.out.println(max);
		
		/*//1374. Generate a String With Characters That Have Odd Counts

		 * char[] ch=new char[n];
		 * 
		 * Arrays.fill(ch,'a');
		 * 
		 * if(n%2 ==0){ ch[ch.length-1]='b'; } return new String(ch);
		 */
	}

}

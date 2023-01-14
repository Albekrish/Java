package set2;

import java.util.Arrays;

public class StringAnagram94 {

	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		//Method1:
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		
		if(ch1.length != ch2.length) {
			System.out.println("No");
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		if(result) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not");
		}

		//Method2
		
		int[] a=new int[26];
		int[] b=new int[26];
		
		for(int i=0;i<ch1.length;i++) {
			a[s1.charAt(i)-'a']++;
			b[s2.charAt(i)-'a']++;
		}
		
		boolean out= Arrays.equals(a, b);
		if(result) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not");
		}
	}

}

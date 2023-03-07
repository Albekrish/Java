package evaluation1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountString5 {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * String str= sc.nextLine(); String input=str.trim(); String ref=sc.next();
		 */
		String str="Hello world please";		
		String input=str.trim();
		String ref="Help";
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<ref.length();j++) {
				 if(input.charAt(i) == ref.charAt(j)) 
				 { 
					 char key=ref.charAt(j);
					 hm.put(key,hm.getOrDefault(key, 0)+1); 
				}
				 	
				
			}
			
		}
				
		for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
		}
	}
}

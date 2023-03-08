package com.mentor.practice2;

public class StringImmutable3 {

	public static void main(String[] args) {
		
		// Method1: Using hashCode()
		String s="abc";
		System.out.println(s.hashCode());	
		
		String s1="abc";
		System.out.println(s1.hashCode());
		
		s=s+"cde";
		System.out.println(s.hashCode());
		
		//Method2: using equal operator 
		if(s==s1) {
			System.out.println("Same Location");
		}else {
			System.out.println("Not Same Location");
		}
	}

}

package set1;

import java.util.Scanner;

/*Program to Check Whether a Character is a Vowel or Consonant*/

public class CharVowOrCon29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		//Method 1 if else
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println(c+" is a Vowel");
		}else {
			System.out.println(c+" is consonant");
		}
		
		//Method2: indexOf
		String s="aeiouAEIOU";
		if(s.indexOf(c) !=-1) {
			System.out.println("Vowel");
		}else {
			System.out.println("consonant");
		}
		

	}

}

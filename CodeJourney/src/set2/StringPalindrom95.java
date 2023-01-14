package set2;
//Java Program to find the given two strings are palindrome
public class StringPalindrom95 {

	public static void main(String[] args) {
		String s1="abc";
		String s2="cba";
		if(s1.length() != s2.length()) {
			System.out.println("Not");
		}
		
		//Method2: loop
		int j=s2.length()-1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(j)) {
				System.out.println("Not");
				break;
			}
			j--;
		}
		if(j<0) {
			System.out.println("Palindrome");
		}
		
		//Method2: reverse String
		
		StringBuilder sb= new StringBuilder();
		sb.append(s1);
		sb.reverse();
		
		String reverseSt= sb.toString();
		if(reverseSt.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}
		
	}

}

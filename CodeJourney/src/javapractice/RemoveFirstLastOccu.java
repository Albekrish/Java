package javapractice;

public class RemoveFirstLastOccu {
 //remove first and last occurrence of char from string
	public static void main(String[] args) {
		String s= "GeekforGeeks";
		char ch='e';		
		
		//from start
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ch) {
				s= s.substring(0, i) + s.substring(i+1);
				break;
			}
		}
		//backward traverse
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) == ch) {
				s= s.substring(0, i) + s.substring(i+1);
				break;
			}
		}
		System.out.println(s);

	}

}

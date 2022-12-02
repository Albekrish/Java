package javapractice;

public class StringCharReplace {
	
	public static void main(String[] args) {
		String str="CloudTeCh";		
		
		//Method1: inbuild
		//System.out.println(str.replaceAll("C",""));
		
		//Method2: not using library function
		
		char ch='C'; 
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ch) {
				result += str.charAt(i);
			}
		}
		//System.out.println(result);
		
		//Method3: using char
		String out="";
		for(char a:str.toCharArray()) {
			if(ch != a) {
				out += a; 
			}
		}
		System.out.println(out);
	}
}

package javapractice;


public class NonCharacter {

	public static void main(String[] args) {
		String s="CloudTech#!@";
		
		//To count special character
		int count=0;
		String result="";
		
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			}else {
				result += s.charAt(i);
			}
		}
	
		if(count == 0) {
			System.out.println("No special characters");
		}else {
			System.out.println("The no. of special char:"+ count);
		}
		System.out.println("String after removing spl char:"+ result);
	}
}

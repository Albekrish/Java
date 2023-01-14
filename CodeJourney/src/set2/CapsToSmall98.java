package set2;

//Java Program to print the print the equivalent Capital letter of a given small letter in Alphabets
public class  CapsToSmall98{
	
public static void main(String[] args) {
		String s="GEEKS FOR GEEKS";
		
		String result="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				result += (char)(s.charAt(i)+32);
			}
			else {
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}
}


package set2;

//Java Program to convert all small letter to capital letter without using special functions
public class  SmallToCaps99{
	
public static void main(String[] args) {
		String s="Geeks For Geeks";
		
		String result="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				result += (char)(s.charAt(i)-32);
			}
			else {
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}
}


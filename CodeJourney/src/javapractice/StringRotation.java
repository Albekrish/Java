package javapractice;

public class StringRotation {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
		
		//rotation : s3= s1+s1= "ABCDABCD" -> s2 present in s3.
		if(isRotation(s1,s2)) {
			System.out.println("Rotattion of string is present");
		}else {
			System.out.println("Not present");
		}

	}
	
	public static boolean isRotation(String a, String b) {
		//1. string length should be equal and appended string has s2.
		
		return (a.length()==b.length() && (a+a).indexOf(b) != -1); //true 
		
	}

}

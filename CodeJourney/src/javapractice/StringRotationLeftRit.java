package javapractice;

public class StringRotationLeftRit {

	public static String leftrotate(String s, int d) {		
		String a=s.substring(d)+s.substring(0, d);		
		return a;		
	}

	public static String rightrotate(String s, int d) {
		
		String a=s.substring(s.length()-d,s.length())+s.substring(0,s.length()-d );
		
		return a;
		
	}
	public static void main(String[] args) {
		String s1="GeeksforGeeks";
		int d=2;		
		
		System.out.println(leftrotate(s1, 2));
		
		System.out.println(rightrotate(s1, 2));
		

	}

}

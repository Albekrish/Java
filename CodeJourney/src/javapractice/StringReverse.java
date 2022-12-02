package javapractice;

public class StringReverse {
	// sting have toCharArray() but no reverse()
	//String builder viceverse

	public static void main(String[] args) {
		//Method 1
		
		String s="Geeks for Geeks";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res += s.charAt(i);
		}
		System.out.println(res);
		
		//Method2 append char before string
		String ans="";
		for(char i: s.toCharArray()) {
			ans = i+ans;
		}
		System.out.println(ans);
		
		//Method3 using string builder 
		
		StringBuilder sb=new StringBuilder();
		sb.append(s).reverse();
		System.out.println(sb.toString());
		
	}

}
